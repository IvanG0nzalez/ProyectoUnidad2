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
        
        Medico medico = new Medico("Juan", "Lopez", "Neurologo", hospital);
        Medico medico2 = new Medico("Pedro", "Escobar", "Internista");
        
        Enfermero enfermero = new Enfermero("Carlos", "Tene", "Nombramiento");
        Enfermero enfermero2 = new Enfermero("Felipe", "Caicedo", "Suplente");
        
        Paciente paciente = new Paciente("Eduardo", "Piedra", "110534634", medico, enfermero, hospital);
        Paciente paciente2 = new Paciente("Maria", "Becerra", "1105342414", medico2);
        Paciente paciente3 = new Paciente("Niki", "Nicole", "1412412634", medico);
        
        Ubicacion ubicacion = new Ubicacion("Loja", "Loja", "Av. 08 de diciembre");
        
        hospital.getUbicacionList().add(ubicacion);
        hospital.getMedicoList().add(medico);
        hospital.getMedicoList().add(medico2);
        hospital.getEnfermeroList().add(enfermero);
        hospital.getEnfermeroList().add(enfermero2);
        hospital.getPacienteList().add(paciente);
        hospital.getPacienteList().add(paciente2);
        hospital.getPacienteList().add(paciente3);
//        System.out.println(hospital);

        medico.getPacienteList().add(paciente);
        medico.getPacienteList().add(paciente2);
        medico.getPacienteList().add(paciente3);
//        System.out.println(medico.getHospital().getNombre());

//        System.out.println(paciente.getMedico());
//        System.out.println(paciente2.getMedico());
        paciente.setEnfermero(enfermero);
        paciente2.setEnfermero(enfermero2);
        paciente3.setEnfermero(enfermero2);
//        System.out.println(paciente.getEnfermero());

        paciente2.setHospital(hospital);
//        System.out.println(paciente2.getHospital());

        enfermero.getPacienteList().add(paciente2);
//        System.out.println(enfermero.getPacienteList());
        enfermero.setHospital(hospital);
//        System.out.println(enfermero.getHospital().getNombre());
        System.out.println(hospital);
    }
    
}
