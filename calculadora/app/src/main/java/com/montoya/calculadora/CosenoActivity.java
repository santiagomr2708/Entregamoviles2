package com.montoya.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CosenoActivity extends AppCompatActivity {
    EditText txtangulocoseno;
    Button btncalcular_coseno;
    TextView resultado;

    RadioButton rbtnGrados;
    RadioButton rbtnRadianes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        txtangulocoseno = findViewById(R.id.txtAcoseno);
        btncalcular_coseno = findViewById(R.id.btniniciarcoseno);
        resultado = findViewById(R.id.lblresultadocoseno);
        rbtnGrados = findViewById(R.id.Gcoseno);
        rbtnRadianes = findViewById(R.id.Rcoseno);

        btncalcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = txtangulocoseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = rbtnGrados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(CosenoActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", coseno); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, ingresa un ángulo.");
                }
            }
        });
    }
}
