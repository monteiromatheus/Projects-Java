/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Pedido;
import entidadesEnum.StatusPedido;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class ProgramacaoPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(1080, new Date(),StatusPedido.ENTREGUE);
        
        System.out.println(pedido);
        
        StatusPedido sp1 = StatusPedido.valueOf("ENTREGUE");
        
        System.out.println(sp1);
    }
    
}
