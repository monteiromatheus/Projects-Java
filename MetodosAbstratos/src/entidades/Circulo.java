/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidadesEnum.Color;

/**
 *
 * @author Matheus
 */
public class Circulo extends Formas {
    
    private Double raio;
    
    public Circulo(){
        super();
    }

    public Circulo(Double raio, Color color) {
        super(color);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        
        return Math.PI * Math.pow(raio,2);
    }
    
}
