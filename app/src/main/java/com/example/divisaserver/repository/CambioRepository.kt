package com.example.divisaserver.repository

import com.example.divisaserver.db.CambioDao
import com.example.divisaserver.db.Cambio
import kotlinx.coroutines.flow.Flow

class CambioRepository (private val cambioDao: CambioDao) {
    val allCambio: Flow<List<Cambio>>
    get() = cambioDao.getAll()
}