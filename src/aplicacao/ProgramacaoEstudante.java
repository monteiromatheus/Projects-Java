/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Estudante;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class ProgramacaoEstudante {
    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Estudante estudante = new Estudante();
        
        System.out.printf("NOME: ");
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        
        System.out.println(estudante.CalcularMedia());
        System.out.println(estudante.toString());
        
        sc.close();
    }
    
}
