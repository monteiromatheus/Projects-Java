/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Scanner;
import model.services.PrintServices;

/**
 *
 * @author Matheus
 */
public class ProgramPrintService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        PrintServices<Integer> ps = new PrintServices<>();
        
        System.out.print("How many values ?");
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        
        ps.print();
        System.out.println("First: "+ps.first());
        
        sc.close();
    }
    
}
