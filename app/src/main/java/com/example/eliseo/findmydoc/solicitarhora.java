package com.example.eliseo.findmydoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class solicitarhora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitarhora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //----INICIO DE SPINNERS----
        //Spinner buscar especialista
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
            // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
                // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        //Spinner buscar centro medico
        final Spinner spinner2 = (Spinner) findViewById(R.id.buscarcentromedico);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.centrosmedicos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);
        ///----FIN DE SPINNERS----

        // SACAMOS EL VALOR DE LOS SPINNER
        Button buscar = (Button) findViewById(R.id.botonbuscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String especialista = spinner.getSelectedItem().toString();
                String centromedico = spinner2.getSelectedItem().toString();
                Intent buscar = new Intent(solicitarhora.this, resultado.class);
                buscar.putExtra("Especialista",especialista);
                buscar.putExtra("centro_medico",centromedico);
                startActivity(buscar);
            }
        });

    }

}
