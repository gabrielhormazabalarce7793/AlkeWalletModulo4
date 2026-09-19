package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Configuración de los Botones de Navegación Principal
        Button btnSendMoney = findViewById(R.id.btnSendMoney);
        Button btnRequestMoney = findViewById(R.id.btnRequestMoney);

        // Ir a la pantalla de Enviar Dinero
        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SendMoneyActivity.class);
                startActivity(intent);
            }
        });

        // Ir a la pantalla de Ingresar Dinero
        btnRequestMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RequestMoneyActivity.class);
                startActivity(intent);
            }
        });

        // 2. Prueba y Operación de la Base de Datos Local con Room
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AppDatabase db = AppDatabase.getDatabase(getApplicationContext());
                    // Aquí puedes simular o registrar una transacción de prueba en la BD local
                    int totalTransacciones = db.transactionDao().getAllTransactions().size();
                    Log.d("ROOM_TEST", "Transacción verificada en BD. Total en BD: " + totalTransacciones);
                } catch (Exception e) {
                    Log.e("ROOM_TEST", "Error en Room: " + e.getMessage());
                }
            }
        }).start();

        // 3. Prueba de Conexión y Manejo de Errores con Retrofit (API REST)
        ApiClient.getApiService().getTransactions().enqueue(new retrofit2.Callback<List<TransactionResponse>>() {
            @Override
            public void onResponse(retrofit2.Call<List<TransactionResponse>> call, retrofit2.Response<List<TransactionResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    int cantidad = response.body().size();
                    Log.d("RETROFIT_TEST", "¡Conexión exitosa con la API! Transacciones recibidas: " + cantidad);
                } else {
                    Log.d("RETROFIT_TEST", "Error en la respuesta del servidor: " + response.code());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<List<TransactionResponse>> call, Throwable t) {
                // Manejo robusto de errores de red exigido por el proyecto
                Log.e("RETROFIT_TEST", "Fallo de conexión o error de red: " + t.getMessage());
            }
        });
    }
}