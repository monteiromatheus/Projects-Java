/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author Matheus
 */
public class Invoice {
    
    private Double pagamento;
    private Double imposto;
    
    public Invoice(){
        
    }

    public Invoice(Double pagamento, Double imposto) {
        this.pagamento = pagamento;
        this.imposto = imposto;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
    
    public Double getTotalPagamento(){
        
        return getPagamento()+getImposto();
    }
    
}
