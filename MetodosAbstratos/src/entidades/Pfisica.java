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
public class Pfisica extends Impostos {
    
    private Double gastosSaude;
    
    public Pfisica(){
        super();
    }

    public Pfisica(Double gastosSaude, String nome, Double ganhoAnual) {
        super(nome, ganhoAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    
    @Override
    public double Taxa(){
        
      return (getGanhoAnual() < 20000.00) ? getGanhoAnual()*0.15 - gastosSaude*0.5 : getGanhoAnual()*0.25 - gastosSaude*0.5;
      
    }
    
}
