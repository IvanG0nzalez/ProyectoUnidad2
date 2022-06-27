/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Iván González
 */
public class Medico extends Persona{
    
    private String especialidad;
    private Float sueldo;
    private Integer numConsultorio;
    
    private Hospital hospital;
    private List<Paciente> pacienteList;

    //Constructores
    public Medico(String nombre, String apellido, String especialidad, Hospital hospital, Integer numConsultorio) {
        super(nombre, apellido);
        this.especialidad = especialidad;
        this.numConsultorio = numConsultorio;
        this.hospital = hospital;
        pacienteList = new LinkedList<Paciente>();
    }
    
    public Medico(String nombre, String apellido, String cedula, String especialidad, Hospital hospital, Integer numConsultorio) {
        super(nombre, apellido, cedula);
        this.especialidad = especialidad;
        this.numConsultorio = numConsultorio;
        this.hospital = hospital;
        pacienteList = new LinkedList<Paciente>();
    }

    public Medico(String nombre, String apellido, String cedula, String especialidad,Integer numConsultorio, Float sueldo, Hospital hospital) {
        super(nombre, apellido, cedula);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.numConsultorio = numConsultorio;
        this.hospital = hospital;
        pacienteList = new LinkedList<Paciente>();
    }
    
    //Métodos Accesores
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
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

    public Integer getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(Integer numConsultorio) {
        this.numConsultorio = numConsultorio;
    }
    
//    @Override
//    public String toString() {
//        return super.getNombre() + " " + 
//                super.getApellido() + " - " + super.getCedula() + " - " + especialidad + " - " + sueldo + "\n";
//    }
    
    
    
    
    
}
