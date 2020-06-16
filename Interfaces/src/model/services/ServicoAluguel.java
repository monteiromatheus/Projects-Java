/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import model.entities.Aluguel;
import model.entities.Invoice;
/**
 *
 * @author Matheus
 */
public class ServicoAluguel {
    
    private Double precoPorDia;
    private Double precoPorHora;
    
    private ServicoImposto impostobrasil;
    
    public ServicoAluguel(){
        
    }

    public ServicoAluguel(Double precoPorDia, Double precoPorHora, ServicoImposto impostobrasil) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.impostobrasil = impostobrasil;
    }
    
    public void processInvoice(Aluguel aluguel){
        
        long t1 = aluguel.getStart().getTime();
        long t2 = aluguel.getFinish().getTime();
        
        double hours = (double)(t2-t1)/1000/60/60;
        
        double pagamento;
        if(hours <= 12){
            
             pagamento = Math.ceil(hours)*precoPorHora;
        } else{
            
             pagamento = Math.ceil(hours/24)*precoPorDia;
        }
        
        double tax = impostobrasil.Imposto(pagamento);
        aluguel.setInvoice(new Invoice(pagamento,tax)); 
        
    }
    
    
}
