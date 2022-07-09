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
    private int numEspecialista;
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
    public void agregarMedico(Medico medico){
       this.medicoList.add(new Medico(medico.getNombre(), medico.getApellido(), medico.getCedula(), medico.getEspecialidad(),this, medico.getNumConsultorio()));
       incrementarNumeroEspecialidad();
    }
    
    public void agregarEnfermero(Enfermero enfermero){
        this.enfermeroList.add(new Enfermero(enfermero.getNombre(), enfermero.getApellido(), enfermero.getCedula(), enfermero.getTipContrato(), this));
    }
    
    public void agregarPaciente(Paciente paciente){
        this.pacienteList.add(new Paciente(paciente.getNombre(), paciente.getApellido(), 
                paciente.getCedula(), paciente.getEdad(), paciente.getPeso(), paciente.getEstatura(), paciente.getFechaNacimiento(), paciente.getGenero(), paciente.getMotivo(), this));
    }
    
    public void agregarubicacion(Ubicacion ubicacion){
        this.ubicacionList.add(new Ubicacion(ubicacion.getCiudad(), ubicacion.getProvincia(), ubicacion.getCallePrincipal(), this));
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
            this.totalSueldo = totalSueldo + medico.getSueldo()/2;
        }
    }
    
    public void  asignarSueldoEnfermero(Enfermero enfermero, Float sueldo){
        enfermero.setSueldo(sueldo);
        
        for (int i = 1; i < enfermeroList.size(); i++) {
            this.totalSueldo = totalSueldo + enfermero.getSueldo()/2;
        }
    }
    
    public void buscarPaciente(String cedula){
        for (Paciente paciente : pacienteList) {
            if (paciente.getCedula().equals(cedula)) {
                System.out.println(paciente);
            }
        }
    }
    
    public void buscarMedico(String cedula){
        for (Medico medico : medicoList) {
            if (medico.getCedula().equals(cedula)) {
                System.out.println(medico);
            }
        }
    }
    
    public void buscarEnfermero(String cedula){
            for (Enfermero enfermero : enfermeroList) {
                if (enfermero.getCedula().equals(cedula)) {
                    System.out.println(enfermero);
                }
            }
    }
    
    public void incrementarNumeroEspecialidad(){
        this.numEspecialista = numEspecialista + 1;
    }
    
    public void presentarHospital(){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\tHospital " + this.getNombre());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t      Locaciones");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(this.getUbicacionList());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Total de especialistas del Hospital: " + this.numEspecialista);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t   ***Doctores***");
        System.out.println(this.getMedicoList().get(0).getNombre() + " " + this.getMedicoList().get(0).getApellido() + " - " + this.getMedicoList().get(0).getCedula() + " - " + this.getMedicoList().get(0).getEspecialidad());
        System.out.println(this.getMedicoList().get(0).getNombre() + " " + this.getMedicoList().get(1).getApellido() + " - " + this.getMedicoList().get(1).getCedula() + " - " + this.getMedicoList().get(1).getEspecialidad());
        System.out.println(this.getMedicoList().get(0).getNombre() + " " + this.getMedicoList().get(2).getApellido() + " - " + this.getMedicoList().get(2).getCedula() + " - " + this.getMedicoList().get(2).getEspecialidad());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t   ***Enfermeros***");
        System.out.println(this.getEnfermeroList().get(0).getNombre() + " " + this.getEnfermeroList().get(0).getApellido() + " - " + this.getEnfermeroList().get(0).getCedula() + " - " + this.getEnfermeroList().get(0).getTipContrato());
        System.out.println(this.getEnfermeroList().get(0).getNombre() + " " + this.getEnfermeroList().get(1).getApellido() + " - " + this.getEnfermeroList().get(1).getCedula() + " - " + this.getEnfermeroList().get(1).getTipContrato());
        System.out.println(this.getEnfermeroList().get(0).getNombre() + " " + this.getEnfermeroList().get(2).getApellido() + " - " + this.getEnfermeroList().get(2).getCedula() + " - " + this.getEnfermeroList().get(2).getTipContrato());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t ***Lista de Paciente***");
        System.out.println(this.getPacienteList().get(0).getNombre() + " " + this.getPacienteList().get(0).getApellido() 
                            + " - " + this.getPacienteList().get(0).getCedula() + " - " + this.getPacienteList().get(0).getGenero() + " - "
                            + this.getPacienteList().get(0).getEdad() + " anios - " + this.getPacienteList().get(0).getMotivo());
        System.out.println(this.getPacienteList().get(1).getNombre() + " " + this.getPacienteList().get(1).getApellido() 
                            + " - " + this.getPacienteList().get(1).getCedula() + " - " + this.getPacienteList().get(1).getGenero() + " - "
                            + this.getPacienteList().get(1).getEdad() + " anios - " + this.getPacienteList().get(1).getMotivo());
        System.out.println(this.getPacienteList().get(2).getNombre() + " " + this.getPacienteList().get(2).getApellido() 
                            + " - " + this.getPacienteList().get(2).getCedula() + " - " + this.getPacienteList().get(2).getGenero() + " - "
                            + this.getPacienteList().get(2).getEdad() + " anios - " + this.getPacienteList().get(2).getMotivo());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Total a pagar: " + this.totalSueldo);
    }
    
    //Métodos Accesores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEspecialista() {
        return numEspecialista;
    }

    public void setNumEspecialista(int numEspecialidad) {
        this.numEspecialista = numEspecialidad;
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
        return "Hospital:\t" + nombre + "\nUbicaciones: " + ubicacionList + "\n" + this.getMedicoList() + "\nEnfermeros: " + enfermeroList + "\nLista de Pacientes: " + pacienteList +'}';
    }
    
    
    
}
