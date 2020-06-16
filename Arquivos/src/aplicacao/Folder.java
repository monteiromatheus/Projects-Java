/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Folder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Folder path: ");
        String strpath = sc.nextLine();
        
        File path = new File(strpath);
        
        File folders[] = path.listFiles(File::isDirectory);
        
        for(File folder:folders){
            
            System.out.println(folder);
            
        }
        
        boolean success = new File(strpath +"\\subdir").mkdir();
     
        sc.close();
        
        
        
    }
    
}
