package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Temporizador de 2.5 segundos (2500 ms) para simular la carga inicial
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Abre la pantalla principal (MainActivity)
                Intent intent = new Intent(SplashActivity.this, AuthLandingActivity.class);
                startActivity(intent);
                finish(); // Cierra el Splash para que no pueda regresar con el botón físico
            }
        }, 2500);
    }
}