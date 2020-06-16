/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.ImportadoProduto;
import entidades.Produto;
import entidades.UsadoProduto;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class ProgamacaoProduto {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.printf("Número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Produto número #" + i);
            System.out.printf("Comum, usado ou importado (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Preço: ");
            double preco = sc.nextDouble();

            if (ch == 'i') {

                System.out.printf("Taxa: ");
                double taxa = sc.nextDouble();
                list.add(new ImportadoProduto(taxa, nome, preco));

            } else if (ch == 'u') {

                System.out.printf("Data de fabricação (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                list.add(new UsadoProduto(data, nome, preco));
            } else {
                
                list.add(new Produto(nome, preco));
            }
            
        }
        
        System.out.println("Tabela de preços: ");
        
        for(Produto p : list){
            
            System.out.println(p.priceTag());
        }

        sc.close();
    }

}
