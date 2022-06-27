/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Grupo Administracion Hospital
 */
public class Enfermero extends Persona{
    
    private Float sueldo;
    private String tipContrato;

    private List<Paciente> pacienteList;
    private Hospital hospital;

    public Enfermero() {
        pacienteList = new LinkedList<Paciente>();
    }

    public Enfermero(String nombre, String apellido, String tipContrato) {
        super(nombre, apellido);
        this.tipContrato = tipContrato;
        pacienteList = new LinkedList<Paciente>();
    }

    public Enfermero(String nombre, String apellido, String cedula, String tipContrato) {
        super(nombre, apellido, cedula);
        this.tipContrato = tipContrato;
        pacienteList = new LinkedList<Paciente>();
    }

    public Enfermero(String nombre, String apellido, String cedula, String tipContrato, Hospital hospital) {
        super(nombre, apellido, cedula);
        this.tipContrato = tipContrato;
        this.hospital = hospital;
        pacienteList = new LinkedList<Paciente>();
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipContrato() {
        return tipContrato;
    }

    public void setTipContrato(String tipContrato) {
        this.tipContrato = tipContrato;
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Enfermero{" + "nombre: " + super.getNombre() + ", apellido: " + super.getApellido() + ", cedula: " + super.getCedula() + ", contrato=" + tipContrato + ", sueldo: "+ sueldo + '}';
    }
    
    
    
    
}
