/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import model.entities.ComboDevice;
import model.entities.Device;

/**
 *
 * @author Matheus
 */
public class ProgramDevice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComboDevice dv = new ComboDevice("2030");
        dv.processDoc("My Dissertation");
        System.out.println("Scan status: "+dv.scan());
        dv.print("My Dissertation");
        
    }
    
}
