/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Salario;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class ProgramacaoSalario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.printf("NOME: ");
        salario.nome = sc.nextLine();
        System.out.printf("SALÁRIO BRUTO: ");
        salario.salarioBruto = sc.nextDouble();
        System.out.printf("IMPOSTO: ");
        salario.imposto = sc.nextDouble();
        System.out.printf("QUAL A POCENTAGEM DE AUMENTO: ");
        double porcentagem = sc.nextDouble();
        salario.AumentoSalarial(porcentagem);
        System.out.printf("CONTRATO ATUALIZADO: ");
        System.out.println(salario.toString());
        
        sc.close();

    }
}
