/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Grupo Administracion Hospital
 */
public class Ubicacion {
    
    private String ciudad;
    private String provincia;
    private String callePrincipal;
    
    private Hospital hospital;

    public Ubicacion() {
    }

    public Ubicacion(String ciudad, String provincia, String callePrincipal) {
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.callePrincipal = callePrincipal;
    }

    public Ubicacion(String ciudad, String provincia, String callePrincipal, Hospital hospital) {
        this(ciudad, provincia, callePrincipal);
        this.hospital = hospital;
    }
    
    
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return  "Provincia: " + provincia + "\tCiudad: " + ciudad + "\tCalle Principal: " + callePrincipal + "\n";
    }
    
}
