/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Matheus
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marcos");
        list.add("Marcio");
        list.add("Alex");
        list.add("Claudio");

        System.out.println("Tamanho da lista: " + list.size());

        for (String x : list) {

            System.out.println(x);
        }
        System.out.println("----------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'A');

        for (String x : list) {

            System.out.println(x);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Alex: " + list.indexOf("Alex"));
        System.out.println("Claudio: " + list.indexOf("Claudio"));
        System.out.println("----------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String x : result) {

            System.out.println(x);
        }
        System.out.println("----------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }

}
