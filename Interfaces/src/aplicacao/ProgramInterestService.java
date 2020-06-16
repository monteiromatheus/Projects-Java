/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import model.entities.BrazilInterestService;
import model.entities.UsaInterestService;
import model.services.InterestService;

/**
 *
 * @author Matheus
 */
public class ProgramInterestService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Amount: ");
        double amount = sc.nextDouble();
        System.out.printf("Months: ");
        int months = sc.nextInt();
        
        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);
        
        System.out.println(String.format("Valor: %.2f ",payment));
        
    }
    
}
