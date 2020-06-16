/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Aluguel {
    
    private Date start;
    private Date finish;
    
    private Veiculo veiculo;
    private Invoice invoice;
    
    public Aluguel(){
        
    }

    public Aluguel(Date start, Date finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
   
}
