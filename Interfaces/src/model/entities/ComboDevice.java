/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.services.Printer;
import model.services.Scanner;

/**
 *
 * @author Matheus
 */
public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }
    
    @Override
    public void processDoc(String doc) {
      System.out.println("Combo Processing: "+doc);    
    }

    @Override
    public String scan() {
        
       return "Combo scan Result";   
    }

    @Override
    public void print(String doc) {
        
        System.out.println("Combo Printing: "+doc);    
    }
    
}
