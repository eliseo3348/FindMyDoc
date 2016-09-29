package com.example.eliseo.findmydoc;

/**
 * Created by eliseo on 01-09-16.
 */
public class horamedica {
    private String doctor; //Se busca por rut
    private String paciente; // busca el paciente por rut
    private Integer ID;
    private Integer centromedico;
    public horamedica(){}
    public horamedica(String doctor, String paciente, Integer ID, Integer centromedico)
    {
        this.centromedico=centromedico;
        this.doctor=doctor;
        this.paciente=paciente;
        this.ID=ID;
    }

    public void setCentromedico(Integer centromedico) {
        this.centromedico = centromedico;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Integer getCentromedico() {
        return centromedico;
    }

    public Integer getID() {
        return ID;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getPaciente() {
        return paciente;
    }
}
