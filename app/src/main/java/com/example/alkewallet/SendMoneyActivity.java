package com.example.alkewallet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SendMoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        TextView btnBackSend = findViewById(R.id.btnBackSend);
        Button btnConfirmSend = findViewById(R.id.btnConfirmSend);

        btnBackSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Vuelve a la Home Page
            }
        });

        btnConfirmSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SendMoneyActivity.this, "¡Transferencia realizada con éxito!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}