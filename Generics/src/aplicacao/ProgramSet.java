/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entities.Treeset;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Matheus
 */
public class ProgramSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        System.out.printf("How many students for a course A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            courseA.add(sc.nextInt());

        }
        
        Set<Integer> courseB = new HashSet<>();
        System.out.printf("How many students for a course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            courseB.add(sc.nextInt());

        }
        
        Set<Integer> courseC = new HashSet<>();
        System.out.printf("How many students for a course C: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            courseC.add(sc.nextInt());

        }
        
        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);
        
        System.out.println(total.size());
    }

}
