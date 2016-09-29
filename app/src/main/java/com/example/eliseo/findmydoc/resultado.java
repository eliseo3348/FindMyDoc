package com.example.eliseo.findmydoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        //Aqui comienza el codigo
        TextView buscando = (TextView) findViewById(R.id.buscando);

        String centromedico = getIntent().getExtras().getString("centro_medico");
        String especialista = getIntent().getExtras().getString("Especialista");
        if (centromedico.equals("Seleccione Un Centro Medico"))
        {
            buscando.setText("Usted esta buscando por especialidad: "+ especialista);
        }
        else if (especialista.equals("Seleccione Una Especialidad"))
        {
            buscando.setText("Usted esta buscado por centro medico: " + centromedico);
        }
        else
        {
            buscando.setText("Usted está buscando por "+especialista + " en " + centromedico  );
        }

    }
}
