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
public class Pjuridica extends Impostos {
    
    private  Integer numeroEmpregados;
    
    public Pjuridica(){
        super();
    }

    public Pjuridica(Integer numeroEmpregados, String nome, Double ganhoAnual) {
        super(nome, ganhoAnual);
        this.numeroEmpregados = numeroEmpregados;
    }

    public Integer getNumeroEmpregados() {
        return numeroEmpregados;
    }

    public void setNumeroEmpregados(Integer numeroEmpregados) {
        this.numeroEmpregados = numeroEmpregados;
    }
    
    @Override
    public double Taxa(){
        
        return (numeroEmpregados > 10) ? getGanhoAnual()*0.14 : getGanhoAnual()*0.16;
    }
}
