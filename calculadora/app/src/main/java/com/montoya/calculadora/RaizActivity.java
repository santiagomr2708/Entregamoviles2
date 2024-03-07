package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaizActivity extends AppCompatActivity {

    EditText numero;
    Button btnCraiz;
    TextView resultadoraiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);

        EditText numero = findViewById(R.id.txtnumero);
        Button btnCraiz = findViewById(R.id.btncalcularraiz);
        TextView resultadoraiz = findViewById(R.id.lblresultado_raiz);

        btnCraiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String numberString = numero.getText().toString();
                if (!numberString.isEmpty()) {
                    double number = Double.parseDouble(numberString);
                    double sqrt = Math.sqrt(number);
                    Intent intent = new Intent(RaizActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", sqrt); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultadoraiz.setText("Por favor, ingresa un número.");
                }
            }
        });

    }
}
