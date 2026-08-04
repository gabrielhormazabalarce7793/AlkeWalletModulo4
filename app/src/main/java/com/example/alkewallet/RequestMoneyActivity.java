package com.example.alkewallet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RequestMoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_money);

        TextView btnBackRequest = findViewById(R.id.btnBackRequest);
        Button btnConfirmRequest = findViewById(R.id.btnConfirmRequest);

        btnBackRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Regresa a Home
            }
        });

        btnConfirmRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RequestMoneyActivity.this, "¡Solicitud de dinero enviada con éxito!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}