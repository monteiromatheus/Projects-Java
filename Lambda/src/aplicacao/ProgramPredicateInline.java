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
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Matheus
 */
public class ProgramPredicateInline {

    /**
     * @param args the command line arguments
     */
      //As outras formas de se utilizar o COMPARATOR estão disponíveis no link do GitHub. A forma utilizada nesse código
     //foi a Expressão lambda anônima inline para remover um item da lista.
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
                list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
                list.removeIf(p -> p.getPreco() >= 900.0);
                list.forEach((p) -> {
                    System.out.println(p);
                });
                
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
