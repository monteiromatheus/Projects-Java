/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Matheus
 */
public class ProgramStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));
        
        Stream<String> st2 = Stream.of("Maria","João");
        System.out.println(Arrays.toString(st2.toArray()));
        
        Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        
        Stream<Long> st4 = Stream.iterate(new Long[]{0L,1L},p -> new Long[]{p[1],p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
        
        Stream<Integer> st5 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st5.toArray()));
        
        int sum = list.stream().reduce(0,(x,y) -> x+y);
        System.out.println(sum);
        
        List<Integer> newList = list.stream().filter(x -> x%2 == 0).map(x -> x*10).collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
    
}
