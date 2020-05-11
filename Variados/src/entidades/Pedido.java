/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidadesEnum.StatusPedido;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Pedido {

    private Integer id;
    private Date momento;
    private StatusPedido status;

    public Pedido(Integer id, Date momento, StatusPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{ id = " + id + ", Momento = " + momento + ", Status = " + status + " }";
    }

}
