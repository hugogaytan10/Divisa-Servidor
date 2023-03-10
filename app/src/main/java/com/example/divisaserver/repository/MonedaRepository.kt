package com.example.divisaserver.repository


import com.example.divisaserver.db.Moneda
import com.example.divisaserver.db.MonedaDao
import kotlinx.coroutines.flow.Flow

class MonedaRepository(private val monedaDao: MonedaDao) {
    val allMonedas: Flow<List<Moneda>>
        get() = monedaDao.getAll()
}