package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardProfileHeader = findViewById(R.id.cardProfileHeader);
        Button btnSendMoney = findViewById(R.id.btnSendMoney);
        Button btnRequestMoney = findViewById(R.id.btnRequestMoney);

        cardProfileHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Perfil próximamente...", Toast.LENGTH_SHORT).show();
            }
        });

        // Conexión real a SendMoneyActivity
        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SendMoneyActivity.class);
                startActivity(intent);
            }
        });

        // Conexión real a RequestMoneyActivity
        btnRequestMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RequestMoneyActivity.class);
                startActivity(intent);
            }
        });
    }
}