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
        Hospital hospital2 = new Hospital("Abendaño");
        
        Medico medico = new Medico("Juan", "Lopez", "11032532" ,"Neurologo");
        Medico medico2 = new Medico("Pedro", "Escobar", "Internista");
        Medico medico3 = new Medico("Martina", "Bustos", "Pediatra");
        
        Enfermero enfermero = new Enfermero("Carlos", "Tene", "11035252","Nombramiento");
        Enfermero enfermero2 = new Enfermero("Felipe", "Caicedo", "214421412" ,"Suplente");
        Enfermero enfermero3 = new Enfermero("Josue", "Quesillo", "214124412" ,"Nombramiento");
        
        Paciente paciente = new Paciente("Eduardo", "Piedra", "110534634");
        Paciente paciente2 = new Paciente("Maria", "Becerra", "1032532523", 27, 57f, 1.67f, "17-03-2000", "Femenino", "Pierna Rota");
        Paciente paciente3 = new Paciente("Niki", "Nicole", "1412412634");
        
        Ubicacion ubicacion = new Ubicacion("Loja", "Loja", "Av. 08 de diciembre");
        Ubicacion ubicacion2 = new Ubicacion("Quito", "Pichincha", "Av. Los Rosales");
        
        hospital.agregarubicacion(ubicacion, hospital);
        hospital.agregarubicacion(ubicacion2, hospital);
        
        hospital.agregarMedico(medico, hospital);
        hospital.agregarMedico(medico2, hospital);
        
        hospital.agregarEnfermero(enfermero, hospital);
        hospital.agregarEnfermero(enfermero2, hospital);
        
        hospital.agregarPaciente(paciente, hospital);
        hospital.agregarPaciente(paciente2, hospital);

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
//        System.out.println(hospital.getTotalSueldo());
    }
    
}
