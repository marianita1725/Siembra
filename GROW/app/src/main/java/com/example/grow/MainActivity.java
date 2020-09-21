package com.example.grow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerLado;
    private Spinner spinnerEtiqueta;
    private Button btnListo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerLado=(Spinner)findViewById(R.id.cmbLado);
        spinnerEtiqueta=(Spinner)findViewById(R.id.cmbEtiqueta) ;
        btnListo = (Button) findViewById(R.id.btnListo);

        String[] opciones={"NORTE","SUR"};
        String[] etiquetas={"FLORES","BULBOS"};

        ArrayAdapter <String> adapter=new ArrayAdapter<>(this,R.layout.sniper_size , opciones);
        spinnerLado.setAdapter(adapter);

        ArrayAdapter <String> adapterEtiqueta=new ArrayAdapter<>(this,R.layout.sniper_size , etiquetas);
        spinnerEtiqueta.setAdapter(adapterEtiqueta);

        btnListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity2.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}