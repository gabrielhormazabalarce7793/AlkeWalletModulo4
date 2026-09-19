package com.example.alkewallet;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TransactionDao {

    // Consulta para obtener todas las transacciones guardadas en la base de datos local
    @Query("SELECT * FROM transactions")
    List<TransactionEntity> getAllTransactions();

    // Método para insertar una nueva transacción
    @Insert
    void insertTransaction(TransactionEntity transaction);
}