package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txtResultado); // Ajusta el ID según tu diseño

        // Obtén el valor del coseno enviado desde la CosenoActivity
        double resultado = getIntent().getDoubleExtra("resultado", 0.0); // 0.0 es el valor predeterminado

        // Muestra el resultado en el TextView
        txtResultado.setText("Resultado: " + resultado);
    }
}
