/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Converter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("COTAÇÃO EM REAL DO DOLAR: ");
        double cotacao = sc.nextDouble();
        System.out.printf("VALOR A COMPRAR EM DOLAR: ");
        double valor = sc.nextDouble();

        double resultado = Converter.ConverterValor(cotacao, valor);

        System.out.printf("VALOR EM REAIS: %.2f\n", resultado);

    }

}
