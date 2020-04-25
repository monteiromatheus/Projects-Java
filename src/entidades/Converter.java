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
public class Converter {
    
    public static double IMPOSTO = 0.06;
    
    public static double ConverterValor(double cotacao, double valor){
        
        return (cotacao*valor)*(1+IMPOSTO);
    }
}
