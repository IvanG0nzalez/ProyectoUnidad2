/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhandry
 */
public class ModelTablePersonal extends DefaultTableModel {
    
    public ModelTablePersonal(){
        
        addColumn("Personal");
        addColumn("Asignacion");
        addColumn("Cedula");
        addColumn("Especialidad");
        addColumn("Sueldo");
    }
}
