/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Grupo Administracion Hospital
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hospital hospital = new Hospital("Isidro Ayora");
        
        Medico medico = new Medico("Juan", "Lopez", "11032532" ,"Neurologo", hospital, 1);
        Medico medico2 = new Medico("Martina", "Bustos","110256253", "Pediatra", hospital, 3);
        Medico medico3 = new Medico("David", "Intriago", "Internista", hospital, 4);
        
        Enfermero enfermero = new Enfermero("Carlos", "Tene", "11035252","Nombramiento", hospital);
        Enfermero enfermero2 = new Enfermero("Felipe", "Caicedo", "214421412" ,"Suplente", hospital);
        Enfermero enfermero3 = new Enfermero("Josue", "Quesillo", "214124412" ,"Nombramiento", hospital);
        
        Paciente paciente = new Paciente("Eduardo", "Piedra", "110534634", 40, 78f, 1.90f, "14-12-1982", "Masculino", "Presion arterial alta", hospital);
        Paciente paciente2 = new Paciente("Maria", "Becerra", "1032532523", 27, 57f, 1.67f, "17-03-1995", "Femenino", "Pierna Rota", hospital);
        Paciente paciente3 = new Paciente("Niki", "Nicole", "1412412634", 50, 39f, 2.00f, "24-07-1972", "Femenino", "Hipotiroidismo", hospital);
        
        Ubicacion ubicacion = new Ubicacion("Loja", "Loja", "Av. 08 de diciembre");
        Ubicacion ubicacion2 = new Ubicacion("Quito", "Pichincha", "Av. Los Rosales");
        
        hospital.agregarubicacion(ubicacion);
        hospital.agregarubicacion(ubicacion2);
        
        hospital.agregarMedico(medico);
        hospital.agregarMedico(medico2);
        hospital.agregarMedico(medico3);
        
        hospital.agregarEnfermero(enfermero);
        hospital.agregarEnfermero(enfermero2);
        hospital.agregarEnfermero(enfermero3);
        
        hospital.agregarPaciente(paciente);
        hospital.agregarPaciente(paciente2);
        hospital.agregarPaciente(paciente3);

        hospital.asignarPacienteAMedico(paciente, medico2);
        hospital.asignarPacienteAMedico(paciente2, medico);
        hospital.asignarPacienteAMedico(paciente3, medico2);
        
        hospital.asignarPacienteAEnfermero(enfermero, paciente);
        hospital.asignarPacienteAEnfermero(enfermero, paciente2);
        hospital.asignarPacienteAEnfermero(enfermero2, paciente3);

        hospital.aisgnarSueldoMedico(medico, 5000f);
        hospital.aisgnarSueldoMedico(medico2, 1000f);
        hospital.aisgnarSueldoMedico(medico3, 500f);
        hospital.asignarSueldoEnfermero(enfermero, 1500f);
        hospital.asignarSueldoEnfermero(enfermero2, 1500f);
        hospital.asignarSueldoEnfermero(enfermero3, 1500f);
        
        hospital.presentarHospital();
    }
    
}
