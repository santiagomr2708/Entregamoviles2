package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFseno;
    Button btnFcoseno;
    Button btnFraiz;
    Button btnFperimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFseno = findViewById(R.id.btnfseno);
        btnFcoseno = findViewById(R.id.btnfcoseno);
        btnFraiz = findViewById(R.id.btnfraiz);
        btnFperimetro = findViewById(R.id.btnfperimetro);

        btnFseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SenoActivity.class);
                startActivity(intent);
            }
        });
        btnFcoseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CosenoActivity.class);
                startActivity(intent);
            }
        });
        btnFraiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RaizActivity.class);
                startActivity(intent);
            }
        });
        btnFperimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerimetroActivity.class);
                startActivity(intent);
            }
        });
    }
}