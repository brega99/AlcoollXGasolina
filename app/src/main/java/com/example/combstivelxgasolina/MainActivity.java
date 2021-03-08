package com.example.combstivelxgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Comparar(View view) {
        TextView resultado = findViewById(R.id.Resultado);

        EditText gasolina = findViewById(R.id.Gasolina);
        EditText alcool = findViewById(R.id.Álcool);

        Float valorgasolina = Float.parseFloat(gasolina.getText().toString());
        Float valoralcool = Float.parseFloat(alcool.getText().toString());

        if (valorgasolina<=valoralcool){
            resultado.setText("Gasolina");
        }
        else{
            resultado.setText("Álcool");
        }
    }
}