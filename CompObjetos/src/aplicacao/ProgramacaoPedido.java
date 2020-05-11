/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Clientes;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidadesEnum.StatusPedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dados do cliente:");
        System.out.printf("Nome:");
        String nome = sc.nextLine();
        System.out.printf("Email:");
        String email = sc.nextLine();
        System.out.printf("Data de Nascimento (dd/mm/yyyy):");
        Date dataNascimento = sdf.parse(sc.next());
        Clientes cliente = new Clientes(nome,email,dataNascimento);
        
        System.out.println("Dados do pedido:");
        System.out.printf("Status:");
        StatusPedido status = StatusPedido.valueOf(sc.next());
        System.out.printf("Itens no pedido:");
        int n = sc.nextInt();
        Pedido pedido = new Pedido(new Date(),status,cliente);
        
        for(int i = 1; i <= n ;i++){
            
            System.out.printf("Pedido #%d: \n",i);
            sc.nextLine();
            System.out.printf("Nome do produto:");
            String produto = sc.nextLine();
            System.out.printf("Preço do produto:");
            double preco = sc.nextDouble();
            Produto produtos = new Produto(produto,preco);
            
            System.out.println("Quantidade:");
            int quantidade = sc.nextInt();
            
            ItemPedido itemPedido = new ItemPedido(quantidade,preco,produtos);
            
            pedido.addItem(itemPedido);
            
        }
        
        System.out.println("Resumo do pedido:");
        System.out.println(pedido);
        
        
        sc.close();
    }
    
}
