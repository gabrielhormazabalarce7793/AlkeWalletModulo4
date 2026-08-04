package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AuthLandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_landing);

        Button btnCreateAccountLanding = findViewById(R.id.btnCreateAccountLanding);
        TextView btnAlreadyHaveAccount = findViewById(R.id.btnAlreadyHaveAccount);

        // 1. Botón "Crear cuenta nueva" -> abre SignupActivity
        btnCreateAccountLanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuthLandingActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        // 2. Botón "¿Ya tiene cuenta?" -> abre LoginActivity
        btnAlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuthLandingActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}