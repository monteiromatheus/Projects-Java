/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Matheus
 */
public class ProgramMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("Username","Maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("Phone","999348567");
        
        System.out.println(cookies.size());
        
        System.out.println("All Cookies:");
        cookies.keySet().forEach((key) -> {
            System.out.println(key+" : "+cookies.get(key));
        });
       
       cookies.remove("Email");
       System.out.println(cookies.size());
    }
    
}
