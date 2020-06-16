/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import model.exception.SaqueException;

/**
 *
 * @author Matheus
 */
public class Saque {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Saque() {

    }

    public Saque(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void withDraw(Double amount) {

        if (amount > withdrawLimit) {

            throw new SaqueException("The amount exceed withdraw limit");
        } else if (amount > balance) {

            throw new SaqueException("Not enough balance");

        } else {

            this.balance -= amount;

        }
    }

}
