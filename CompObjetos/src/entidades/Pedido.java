/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidadesEnum.StatusPedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Pedido {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private Date moment;
    private StatusPedido status;

    private Clientes cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Date moment, StatusPedido status, Clientes cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void addItem(ItemPedido item) {

        itens.add(item);

    }

    public void removeItem(ItemPedido item) {

        itens.remove(item);
    }

    public Double total() {
        double soma = 0.0;

        for (ItemPedido p : itens) {

            soma += p.subTotal();
        }

        return soma;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Data e Hora: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens:");
        for (ItemPedido p : itens) {
            sb.append(p +"\n");
        }
        
        sb.append("Total:");
        sb.append(String.format("$ %.2f ",total()));
        
        return sb.toString();
    }

}
