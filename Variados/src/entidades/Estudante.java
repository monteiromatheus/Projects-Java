/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Matheus
 */
public class Estudante {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double CalcularMedia() {

        return (nota1 + nota2 + nota3);

    }

    @Override
    public String toString() {
        
        if(CalcularMedia() > 60){
            
            return "PASS";
            
        }
        
        else{
            
            return "FAILED"+String.format("\nMISSING %.2f POINTS",(60-CalcularMedia()));
        }
        
    }
}
