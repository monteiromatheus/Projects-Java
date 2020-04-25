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
public class Salario {
    
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    
    public double SalarioLiquido(){
        
        return (salarioBruto - imposto);
    }
    
    public void AumentoSalarial(double porcentagem){
        
        salarioBruto *= (1+(porcentagem)/100);
        
    }
    
    @Override
    public String toString(){
        
        return nome+", "+String.format("%.2f", SalarioLiquido());
    }
    
}
