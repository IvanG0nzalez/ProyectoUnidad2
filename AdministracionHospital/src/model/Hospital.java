/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Grupo Administracion Hospital
 */
public class Hospital {
    
    private String nombre;
    private int especialidad;
    private Float totalSueldo = 0f;
    
    private List<Ubicacion> ubicacionList;
    private List<Medico> medicoList;
    private List<Enfermero> enfermeroList;
    private List<Paciente> pacienteList;
    
    
    //Constructores
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

    //Métodos
    public void agregarMedico(Medico medico, Hospital hospital){
       this.medicoList.add(new Medico(medico.getNombre(), medico.getApellido(), medico.getCedula(), medico.getEspecialidad()));
       medico.setHospital(hospital);
    }
    
    public void agregarEnfermero(Enfermero enfermero, Hospital hospital){
        this.enfermeroList.add(new Enfermero(enfermero.getNombre(), enfermero.getApellido(), enfermero.getCedula(), enfermero.getTipContrato()));
        enfermero.setHospital(hospital);
    }
    
    public void agregarPaciente(Paciente paciente, Hospital hospital){
        this.pacienteList.add(new Paciente(paciente.getNombre(), paciente.getApellido(), 
                paciente.getCedula(), paciente.getEdad(), paciente.getPeso(), paciente.getEstatura(), paciente.getFechaNacimiento(), paciente.getGenero(), paciente.getMotivo()));
        paciente.setHospital(hospital);
    }
    
    public void agregarubicacion(Ubicacion ubicacion, Hospital hospital){
        this.ubicacionList.add(new Ubicacion(ubicacion.getCiudad(), ubicacion.getProvincia(), ubicacion.getCallePrincipal()));
        ubicacion.setHospital(hospital);
    }
    
    public void asignarPacienteAMedico(Paciente paciente, Medico medico){
        paciente.setMedico(medico);
        medico.getPacienteList().add(paciente);
    }
    
    public void asignarPacienteAEnfermero(Enfermero enfermero, Paciente paciente){
        enfermero.getPacienteList().add(paciente);
        paciente.setEnfermero(enfermero);
    }
    
    public void aisgnarSueldoMedico(Medico medico, Float sueldo){
        medico.setSueldo(sueldo);
        
        for (int i = 1; i < medicoList.size(); i++) {
            this.totalSueldo = totalSueldo + medico.getSueldo();
        }
    }
    
    public void  asignarSueldoEnfermero(Enfermero enfermero, Float sueldo){
        enfermero.setSueldo(sueldo);
        
        for (int i = 1; i < enfermeroList.size(); i++) {
            this.totalSueldo = totalSueldo + enfermero.getSueldo();
        }
    }
    
    //Métodos Accesores
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

    public Float getTotalSueldo() {
        return totalSueldo;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ubicacionList=" + ubicacionList + ", medicoList=" + medicoList + ", enfermeroList=" + enfermeroList + ", pacienteList=" + pacienteList +'}';
    }
    
    
    
}
