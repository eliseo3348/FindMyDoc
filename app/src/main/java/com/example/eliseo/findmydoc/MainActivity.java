package com.example.eliseo.findmydoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button registrarse = (Button) findViewById(R.id.registrar);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registraar = new Intent(MainActivity.this, Registrarse.class);
                startActivity(registraar);
            }
        });
        Button iniciar_sesion = (Button) findViewById(R.id.iniciar);
        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iniciarsesion = new Intent(MainActivity.this, inicio.class);
                startActivity(iniciarsesion);
            }
        });


    }


}
