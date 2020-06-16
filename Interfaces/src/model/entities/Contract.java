/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;

    private List<Installments> list = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installments> getList() {
        return list;
    }

    public void addInstallment(Installments installment) {
       list.add(installment);
    }

    public void removeInstallment(Installments installment) {
        list.remove(installment);
    }

}
