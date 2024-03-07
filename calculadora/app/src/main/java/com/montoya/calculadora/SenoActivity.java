package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SenoActivity extends AppCompatActivity {

    EditText txtanguloseno;
    RadioButton rbtngrados, rbtnradianes;
    Button btncalcular_seno;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);

        // Inicializa las vistas
        txtanguloseno = findViewById(R.id.txtAseno);
        rbtngrados = findViewById(R.id.Gseno);
        rbtnradianes = findViewById(R.id.Rseno);
        btncalcular_seno = findViewById(R.id.btniniciarseno);
        resultado = findViewById(R.id.lblresultadoseno);

        // Agrega el listener al botón de cálculo
        btncalcular_seno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén el ángulo ingresado por el usuario
                double angle = Double.parseDouble(txtanguloseno.getText().toString());

                // Calcula el seno según la selección del usuario (grados o radianes)
                if (rbtngrados.isChecked()) {
                    // Ángulo en grados
                    double radians = Math.toRadians(angle);
                    double sinValue = Math.sin(radians);
                    Intent intent = new Intent(SenoActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", sinValue); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else if (rbtnradianes.isChecked()) {
                    // Ángulo en radianes
                    double sinValue = Math.sin(angle);
                    Intent intent = new Intent(SenoActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", sinValue); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, selecciona el tipo de ángulo.");
                }

            }
        });
    }
}
