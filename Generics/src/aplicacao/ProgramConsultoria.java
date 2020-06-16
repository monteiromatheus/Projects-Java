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
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import model.services.CalculationService;

/**
 *
 * @author Matheus
 */
public class ProgramConsultoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        
        String path = "C:\\Users\\Matheus\\Desktop\\in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while (line != null) {
                String dados[] = line.split(",");
                list.add(new Product(dados[0],Double.parseDouble(dados[1])));
                line = br.readLine();
                
            }
            Product x = Collections.max(list);
            System.out.println(x);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    

