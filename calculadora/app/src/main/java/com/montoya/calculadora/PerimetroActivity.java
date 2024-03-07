package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroActivity extends AppCompatActivity {
    EditText l1,l2,l3;
    Button btnCperimetro;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro);

        EditText l1 = findViewById(R.id.txtL1);
        EditText l2 = findViewById(R.id.txtL2);
        EditText l3 = findViewById(R.id.txtL3);
        Button btnCperimetro = findViewById(R.id.btniniciarperimetro);
        TextView resultado = findViewById(R.id.lblresultadoperimetro);

        btnCperimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String side1String = l1.getText().toString();
                String side2String = l2.getText().toString();
                String side3String = l3.getText().toString();
                if (!side1String.isEmpty() && !side2String.isEmpty() && !side3String.isEmpty()) {
                    double side1 = Double.parseDouble(side1String);
                    double side2 = Double.parseDouble(side2String);
                    double side3 = Double.parseDouble(side3String);
                    double perimetro = side1 + side2 + side3;
                    Intent intent = new Intent(PerimetroActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", perimetro); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, ingresa las longitudes de los tres lados del triángulo.");
                }
            }
        });
    }
}
