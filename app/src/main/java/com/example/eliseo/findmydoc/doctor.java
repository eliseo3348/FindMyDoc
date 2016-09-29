package com.example.eliseo.findmydoc;

/**
 * Created by eliseo on 01-09-16.
 */
public class doctor {
    private String nombre;
    private String apellido;
    private String rut;
    private String especialidad;
    private Integer centromedico;
    public doctor(){}
    public doctor (String nombre, String apellido, String rut, String especialidad, Integer centromedico)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
        this.especialidad=especialidad;
        this.centromedico=centromedico;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCentromedico(Integer centromedico) {
        this.centromedico = centromedico;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getCentromedico() {
        return centromedico;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
}
