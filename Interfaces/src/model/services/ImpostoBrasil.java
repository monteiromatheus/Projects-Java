/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

/**
 *
 * @author Matheus
 */
public class ImpostoBrasil implements ServicoImposto {
    
     @Override
     public double Imposto(double amount){
         
         if(amount <= 100){
             
             return amount*0.2;
         } else{
             
             return amount*0.15;
         }
         
     }
    
}
