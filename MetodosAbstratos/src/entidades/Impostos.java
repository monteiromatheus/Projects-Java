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
public abstract class Impostos {
    
    private String nome;
    private Double ganhoAnual;
    
    public Impostos(){
        
    }

    public Impostos(String nome, Double ganhoAnual) {
        this.nome = nome;
        this.ganhoAnual = ganhoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGanhoAnual() {
        return ganhoAnual;
    }

    public void setGanhoAnual(Double ganhoAnual) {
        this.ganhoAnual = ganhoAnual;
    }
    
    public abstract double Taxa();
}
