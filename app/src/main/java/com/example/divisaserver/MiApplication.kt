package com.example.divisaserver

import android.app.Application

import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.divisaserver.db.MiDbMonedas
import com.example.divisaserver.work.saveWorker
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import java.util.concurrent.TimeUnit

class MiApplication : Application() {
    // No need to cancel this scope as it'll be torn down with the process
    val applicationScope = CoroutineScope(SupervisorJob())

    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { MiDbMonedas.getDatabase(this, applicationScope) }

    override fun onCreate() {
        super.onCreate()
        val workRequest = PeriodicWorkRequestBuilder<saveWorker>(1, TimeUnit.DAYS).build()
        WorkManager.getInstance(applicationContext).enqueue(workRequest)

    }
}