/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class ItemPedido {
    
    private Integer quantidade;
    private Double preco;
    
    private Produto produto;
    
    public ItemPedido(){
        
    }

    public ItemPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Double subTotal(){
        
        return quantidade*preco;
    }
    
    public String toString(){
        
        return produto.getNome()+", " +String.format("$%.2f", preco)+", Quantidade: "+quantidade+", Subtotal: $ "+subTotal();
    }
    
}
