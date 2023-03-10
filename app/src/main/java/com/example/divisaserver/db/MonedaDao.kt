package com.example.divisaserver.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MonedaDao {

    @Insert
    suspend fun insertar(moneda: Moneda)

    @Query("select * from Moneda")
    fun getAll(): kotlinx.coroutines.flow.Flow<List<Moneda>>

    @Query("DELETE FROM Moneda")
    fun deleteAll() : Int

}