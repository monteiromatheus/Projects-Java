/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import model.entidades.Saque;
import model.exception.SaqueException;

/**
 *
 * @author Matheus
 */
public class ProgramSaque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.printf("Number: ");
            int number = sc.nextInt();
            System.out.printf("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.printf("Initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.printf("Withdraw limit: ");
            double limit = sc.nextDouble();

            Saque saque = new Saque(number, holder, initialBalance, limit);

            System.out.printf("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            saque.withDraw(amount);

            System.out.println("New Balance: " + saque.getBalance());

        } catch (SaqueException e) {

            System.out.println("Withdraw error: " + e.getMessage());
        } 
        
        catch (RuntimeException e) {

            System.out.println("Unxpected error");

        }
        sc.close();

    }

}
