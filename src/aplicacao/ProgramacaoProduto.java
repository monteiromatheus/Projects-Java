/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Produtos;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class ProgramacaoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter account number: ");
        int conta = sc.nextInt();
        System.out.printf("Enter account holder: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.printf("Is there na initial deposit (y/n)?");
        char deposito = sc.next().charAt(0);
        double saldo = 0;
        if(deposito == 'y'){
            
            System.out.printf("Enter initial deposit value: ");
            
            saldo = sc.nextDouble();
        }   
    
        Produtos produto = new Produtos(nome,conta,saldo);
        
        System.out.println("Account data: "+produto.toString());
        
        System.out.printf("Enter a deposit value: ");    
        saldo = sc.nextDouble();
        produto.setSaldo(saldo);
        System.out.println("Updated account data: "+produto.toString());
        
        System.out.printf("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        produto.setSaque(saque);
        System.out.println("Updated account data: "+produto.toString());
        Produtos saques = new Produtos(saque);
        sc.close();
    }

}
