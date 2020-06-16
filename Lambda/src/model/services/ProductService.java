/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import entities.Product;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Matheus
 */
public class ProductService {
    
    public double filtredSum(List<Product> list, Predicate<Product> criterio){
        
        double sum = 0.0;
        for(Product p : list){
            
            if(criterio.test(p)){
                
                sum+=p.getPreco();
            }
        }
        
        return sum;
    }
}
