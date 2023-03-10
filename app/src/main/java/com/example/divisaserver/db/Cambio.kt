package com.example.divisaserver.db

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Cambio (
    @PrimaryKey(autoGenerate = true)
    val  _ID: Int ,
    val codeMonedaCambio: String,
    val cambio: String,
    val fechaActualizacion: String,
    val fechaConsulta: String

)