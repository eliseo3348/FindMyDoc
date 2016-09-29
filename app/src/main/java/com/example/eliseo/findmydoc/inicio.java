package com.example.eliseo.findmydoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Button perfil = (Button) findViewById(R.id.perfil);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent perfill = new Intent(inicio.this, perfil.class);
                startActivity(perfill);
            }
        });
        Button solicitar = (Button) findViewById(R.id.solicitarhora);
        solicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent solicitarr = new Intent(inicio.this, solicitarhora.class);
                startActivity(solicitarr);
            }
        });

    }
}
