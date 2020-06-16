/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Treeset implements Comparable<Treeset> {

    private String nome;
    private Double preco;

    public Treeset() {

    }

    public Treeset(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Treeset{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    @Override
    public int compareTo(Treeset o) {

        return nome.toUpperCase().compareTo(o.getNome().toUpperCase());
    }
}
