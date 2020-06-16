/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 * @param <T>
 */
public class PrintServices<T> {
    
    private List<T> list = new ArrayList<>();
    
    public void addValue(T value) {
        
        list.add(value);
    }
    
    public T first() {
        if (list.isEmpty()) {
            
            throw new IllegalStateException("Lista vazia!!!");
        }
        return list.get(0);
    }
    
    public void print() {
        
        System.out.print("[");
        System.out.print(list.get(0));
        if (!list.isEmpty())
        {
            for(int i = 1;i < list.size();i++){
                System.out.print(","+list.get(i));
            }
        } 
        System.out.print("]");
        System.out.println();
    }
    
}
