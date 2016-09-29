package com.example.eliseo.findmydoc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrarse extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        //iniciacion de los objetos del layout
        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText apellido = (EditText) findViewById(R.id.apellido);
        EditText rut= (EditText) findViewById(R.id.rut);
        EditText pass= (EditText) findViewById(R.id.contraseña);
        EditText correo = (EditText) findViewById(R.id.correo);
        Button registrarse = (Button) findViewById(R.id.registrarse);
        //Guardar variables en un al registrarse
        };
    public void agregarusuario(View view){
        usuariodbhelper dbusuario = new usuariodbhelper(this, null, null, 1);
    }

    }
}