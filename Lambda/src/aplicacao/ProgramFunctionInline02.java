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
import java.util.stream.Collectors;
import model.services.ProductService;

/**
 *
 * @author Matheus
 */
public class ProgramFunctionInline02 {

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
                
                ProductService ps = new ProductService();
                
                double sum = ps.filtredSum(list, p -> p.getPreco() <= 900.0);
                
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }