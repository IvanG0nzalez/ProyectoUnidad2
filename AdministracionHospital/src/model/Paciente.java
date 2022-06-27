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
public class Paciente extends Persona{
    
    private Integer edad;
    private Float peso;
    private Float estatura;
    private String fechaNacimiento;
    private String genero;
    private String motivo;
    
    private Medico medico;
    private Enfermero enfermero;
    private Hospital hospital;
    
    public Paciente(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public Paciente(String nombre, String apellido, String cedula, Integer edad, Float peso, Float estatura, String fechaNacimiento, String genero, String motivo) {
        super(nombre, apellido, cedula);
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.motivo = motivo;
    }
    
    

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return "Paciente{" + "nombre:" + super.getNombre() + ", apellido: " 
                + super.getApellido() + ", cedula: " + super.getCedula() + ", edad=" 
                + edad + ", peso=" + peso + ", estatura=" + estatura + ", fechaNacimiento: "+ fechaNacimiento + ", genero:" + genero + ", motivo: " + motivo +'}';
    }
    
    
    
}
