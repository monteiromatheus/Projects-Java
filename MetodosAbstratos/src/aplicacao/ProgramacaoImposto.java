/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Impostos;
import entidades.Pfisica;
import entidades.Pjuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoImposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Impostos> list = new ArrayList<>();

        System.out.printf("Número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.printf("Pessoa Física ou Jurídica (f/j): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Ganho Anual: ");
            double ganhoAnual = sc.nextDouble();
            if (ch == 'f') {

                System.out.printf("Gastos com Saúde:");
                double gastosSaude = sc.nextDouble();
                list.add(new Pfisica(gastosSaude, nome, ganhoAnual));

            } else {

                System.out.printf("Número de funcionários: ");
                int numeroEmpregados = sc.nextInt();
                list.add(new Pjuridica(numeroEmpregados, nome, ganhoAnual));
            }
        }     
        double soma = 0.0;
        System.out.println("Impostos Pagos: ");
        
        for(Impostos imp : list){
            
            System.out.println(String.format(imp.getNome()+" : "+" $ %.2f",imp.Taxa()));
            soma += imp.Taxa();
        }
        
        System.out.println("Total arrecadado: $ "+soma);
    }

}
