/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class ProgramCuringaDelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3);
        List<Double> myDbls = Arrays.asList(3.14, 3.5, 3.7);
        List<Object> myobj = new ArrayList<>();

        copy(myInts, myobj);
        printList(myobj);
        copy(myDbls, myobj);
        printList(myobj);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {

        source.forEach((number) -> {
            destiny.add(number);
        });

    }

    public static void printList(List<?> list) {

        list.forEach((obj) -> {
            System.out.print(obj + " ");
        });

        System.out.println();

    }

}
