/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.entities.Funcionarios;

/**
 *
 * @author Matheus
 */
public class IntrfaceComparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Funcionarios> list = new ArrayList<>();
        String path = "C:\\Users\\Matheus\\Desktop\\in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String employeCsv = br.readLine();
            while (employeCsv != null) {
                String dados[] = employeCsv.split(",");
                list.add(new Funcionarios(dados[0],Double.parseDouble(dados[1])));
                employeCsv = br.readLine();
                
            }
            Collections.sort(list);
            
            list.forEach((s) -> {
                System.out.println(s.getNome()+", "+s.getSalario());
            });
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
