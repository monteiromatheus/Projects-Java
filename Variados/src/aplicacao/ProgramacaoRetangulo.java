/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Retangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.printf("LARGURA E ALTURA: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("ÁREA: %.2f\n", retangulo.Area());
        System.out.printf("PERÍMETRO: %.2f\n", retangulo.Perimetro());
        System.out.printf("DIAGONAL: %.2f\n", retangulo.Diagonal());

    }

}
