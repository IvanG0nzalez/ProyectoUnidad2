/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultComboBoxModel;
import model.Hospital;
/**
 *
 * @author Jhandry
 */
public class ModelComboBoxHospital extends DefaultComboBoxModel<Hospital> {
    
    public ModelComboBoxHospital(){
        
        addElement(new Hospital("Isidro Ayora"));
        addElement(new Hospital("Isidro Ayora2"));
        addElement(new Hospital("Isidro Ayora3"));
        addElement(new Hospital("Isidro Ayora4"));
        
    }
    
}
