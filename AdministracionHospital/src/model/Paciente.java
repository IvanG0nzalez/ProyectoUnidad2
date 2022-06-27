/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Grupo Administracion Hospital
 */
public class Paciente extends Persona{
    
    private Medico medico;
    private Enfermero enfermero;
    private Hospital hospital;

    public Paciente(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public Paciente(String nombre, String apellido, String cedula, Hospital hospital) {
        super(nombre, apellido, cedula);
        this.hospital = hospital;
    }

    public Paciente(String nombre, String apellido, String cedula, Medico medico) {
        super(nombre, apellido, cedula);
        this.medico = medico;
    }

    public Paciente(String nombre, String apellido, String cedula, Medico medico, Enfermero enfermero, Hospital hospital) {
        super(nombre, apellido, cedula);
        this.medico = medico;
        this.enfermero = enfermero;
        this.hospital = hospital;
    }
    
    

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
}
