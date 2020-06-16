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
public class Terceirizado extends Empregado {

    private Double adicional;

    public Terceirizado() {
      super();
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    
    @Override
    public final double Pagamento(){
        
        return super.Pagamento() + adicional*1.1;
    }
    
}
