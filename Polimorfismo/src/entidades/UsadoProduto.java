/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class UsadoProduto extends Produto {
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
    private Date dataFabricacao;
    
    public UsadoProduto(){
        super();
    }

    public UsadoProduto(Date dataFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public String priceTag() {

        return getNome()+" (usado) "+ String.format("%.2f", preco)+"(Data de Fabricação: "+sdf.format(dataFabricacao)+")";
    }
    
    
}
