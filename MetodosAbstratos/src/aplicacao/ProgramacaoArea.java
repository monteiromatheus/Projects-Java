/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Circulo;
import entidades.Formas;
import entidades.Retangulo;
import entidadesEnum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Formas> list = new ArrayList<>();

        System.out.printf("Número de formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Forma #"+i);
            System.out.printf("Retangulo ou Círculo (r/c):");
            char ch = sc.next().charAt(0);
            System.out.printf("Color(BLACK/RED/BLUE): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            if (ch == 'r') {

                System.out.printf("Largura: ");
                double largura = sc.nextDouble();
                System.out.printf("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(largura, altura, color));
            } else {

                System.out.printf("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(raio, color));
            }

        }
        System.out.println("FORMAS: ");
        
        for(Formas f : list){
            
            System.out.println(String.format("%.2f",f.area()));
        }

        sc.close();
    }

}
