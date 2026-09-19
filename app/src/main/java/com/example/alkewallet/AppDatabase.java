package com.example.alkewallet;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {TransactionEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    // Declaramos el DAO que acabamos de crear
    public abstract TransactionDao transactionDao();

    // Patrón Singleton para asegurar que solo exista una instancia de la base de datos abierta
    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "alke_wallet_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}