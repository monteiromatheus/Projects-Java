/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author Matheus
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class EscrevendoArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String lines[] = {"Goog Morning","Good afternoon","Good Nigth","Deu merda"};
        
        String path = "C:\\Users\\Matheus\\Desktop\\out.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            
            for(String line : lines){
                
                bw.write(line);
                bw.newLine();
                
            }
        }
        
        catch(IOException e){
            
            System.out.println("Error: "+e.getMessage());
        }
        

    }

}