/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 *
 * @author Matheus
 */
public class ProgramPipeline {

    /**
     * @param args the command line arguments
     */
      /*As outras formas de se utilizar o FUNCTION estão disponíveis no link do GitHub. A forma utilizada nesse código
      foi a Expressão Lambda Anônima Inline.*/
    public static void main(String[] args) {
        
            Locale.setDefault(Locale.US);
            List<Product> list = new ArrayList<>();

            String path = "C:\\Users\\Matheus\\Desktop\\in.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line = br.readLine();
                while (line != null) {
                    String dados[] = line.split(",");
                    list.add(new Product(dados[0], Double.parseDouble(dados[1])));
                    line = br.readLine();

                }
               Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
               
               double media = list.stream().map(p -> p.getPreco()).reduce(0.0,(x,y) -> x+y)/list.size();
               System.out.println("Average Price: "+String.format("%.2f", media));
               
               List<String> names = list.stream().map(p -> p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());
               names.forEach(System.out::println);
               
                
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }