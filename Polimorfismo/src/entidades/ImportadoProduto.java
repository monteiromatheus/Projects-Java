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
public class ImportadoProduto extends Produto {
    
    private Double taxa;
    
    public ImportadoProduto(){
        
        super();
    }

    public ImportadoProduto(Double taxa, String nome, Double preco) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
      public double PrecoTotal(){
         
         return taxa + getPreco();
     }
    
    @Override
     public String priceTag() {

        return getNome() + String.format(" %.2f (Taxa da Alfândega: %.2f)", PrecoTotal(),taxa);
    }
     
    
}
