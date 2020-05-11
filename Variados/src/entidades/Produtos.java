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
public class Produtos {

    private String nome;
    private int conta;
    private double saldo;
    private double saque;

    public Produtos(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Produtos(double saque) {
        this.saque = saque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setSaldo(double saldo) {

        this.saldo += saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaque() {

        return saque;
    }

    public void setSaque(double saque) {

        this.saldo -= (saque + 5.00);
    }

    @Override
    public String toString() {

        return conta+ ", Holder: " + nome + ", Balance: " +saldo;
    }
}
