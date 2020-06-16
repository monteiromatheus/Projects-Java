/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.SalvaConta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class ProgramacaoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Conta acc = new Conta(1001, "Alex", 0.0);
        ContaEmpresarial bacc = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Conta acc1 = bacc;
        Conta acc2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
        Conta acc3 = new SalvaConta(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
        acc4.Emprestimo(100.00);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof ContaEmpresarial) {
            ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
            acc5.Emprestimo(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SalvaConta) {
            SalvaConta acc5 = (SalvaConta) acc3;
            acc5.updateSaldo();
            System.out.println("Update!");
        }
        
        Conta acc1 = new Conta(1001,"Alex", 1000.00);
        acc1.Saque(200.00);
        System.out.println(acc1.getSaldo());
        
        Conta acc2 = new SalvaConta(1002, "Maria", 1000.00, 0.01);
        acc2.Saque(200.00);
        System.out.println(acc2.getSaldo());
        
        Conta acc3 = new ContaEmpresarial(1003, "Maria", 1000.00, 500.00);
        acc3.Saque(200.00);
        System.out.println(acc3.getSaldo());
        */
        
        List<Conta> list = new ArrayList<>();
        
        list.add(new ContaEmpresarial(1003, "Bob", 200.0, 200.0));
        list.add(new SalvaConta(1002, "Maria", 1000.00, 0.01));
        
        double soma = 0.0;
        
        for(Conta acc : list){
            
            soma += acc.getSaldo();
        }
        
        System.out.println("TOTAL: "+soma);
        
        
    }

}
