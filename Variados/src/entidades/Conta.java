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
public class Conta {

    private Integer numero;
    private String proprietario;
    protected Double saldo;

    public Conta() {

    }

    public Conta(Integer numero, String proprietario, Double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void Saque(double valor) {

        saldo -= (valor + 5.0);
    }

    public void Deposito(double valor) {

        saldo += valor;
    }

}
