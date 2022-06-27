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
public class Hospital {
    
    private String nombre;
    private int especialidad;
    
    private List<Ubicacion> ubicacionList;
    private List<Medico> medicoList;
    private List<Enfermero> enfermeroList;
    private List<Paciente> pacienteList;

    public Hospital() {
        ubicacionList = new LinkedList<>();
        medicoList = new LinkedList<>();
        enfermeroList = new LinkedList<>();
        pacienteList = new LinkedList<>();
    }

    public Hospital(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public List<Ubicacion> getUbicacionList() {
        return ubicacionList;
    }

    public void setUbicacionList(List<Ubicacion> ubicacionList) {
        this.ubicacionList = ubicacionList;
    }

    public List<Medico> getMedicoList() {
        return medicoList;
    }

    public void setMedicoList(List<Medico> medicoList) {
        this.medicoList = medicoList;
    }

    public List<Enfermero> getEnfermeroList() {
        return enfermeroList;
    }

    public void setEnfermeroList(List<Enfermero> enfermeroList) {
        this.enfermeroList = enfermeroList;
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ubicacionList=" + ubicacionList + ", medicoList=" + medicoList + ", enfermeroList=" + enfermeroList + ", pacienteList=" + pacienteList + '}';
    }
    
    
    
}
