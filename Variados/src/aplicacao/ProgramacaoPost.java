/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Comentarios;
import entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Matheus
 */
public class ProgramacaoPost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Comentarios c1 = new Comentarios("Have a nice trip");
        Comentarios c2 = new Comentarios("Awesome");
        
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);       
        
        p1.addComentario(c1);
        p1.addComentario(c2);
        
        System.out.println(p1);
    }
    
}
