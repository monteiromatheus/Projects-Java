/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Empregado;
import entidades.Terceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoEmpregados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();

        System.out.printf("Número de Empregados: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Empregado #" + i);
            System.out.printf("Terceirizado ?");
            char ch = sc.next().charAt(0);
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Horas: ");
            int horas = sc.nextInt();
            System.out.printf("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 'y') {

                System.out.printf("Adicional: ");
                double adicional = sc.nextDouble();

                lista.add(new Terceirizado(nome, horas, valorPorHora, adicional));
            } else {

                lista.add(new Empregado(nome, horas, valorPorHora));
            }

        }
        
        System.out.println("");
        System.out.println("Pagamentos: ");
        
        for(Empregado emp : lista){
            
            System.out.println(emp.getNome()+" - $"+emp.Pagamento());
            
        }

        sc.close();
    }

}
