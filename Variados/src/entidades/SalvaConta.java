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
public class SalvaConta extends Conta {

    private Double juros;

    public SalvaConta() {
    
    }

    public SalvaConta(Integer numero, String proprietario, Double saldo, Double juros) {
        super(numero, proprietario, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }
    
    public void updateSaldo(){
        
        saldo *= (1+(juros/100));
    }
    
    @Override
    public final void Saque(double valor) {

        saldo -= valor;
    }
}
