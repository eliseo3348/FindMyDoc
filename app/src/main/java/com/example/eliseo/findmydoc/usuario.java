package com.example.eliseo.findmydoc;
import android.database.sqlite.SQLiteDatabase;


/**
 * Created by eliseo on 29-08-16.
 */
public class usuario {

    private String nombre;
    private String apellido;
    private String rut;
    private String pass;
    private String correo;
    public usuario()
    {}
    public usuario(String nombre, String apellido, String rut, String pass, String correo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
        this.pass=pass;
        this.correo=correo;
    }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public String getRut() {
        return rut;
    }
}

