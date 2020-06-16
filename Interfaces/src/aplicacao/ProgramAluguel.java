/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Aluguel;
import model.entities.Veiculo;
import model.services.ImpostoBrasil;
import model.services.ServicoAluguel;

/**
 *
 * @author Matheus
 */
public class ProgramAluguel {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:ss");
        
        System.out.println("Dados do aluguel: ");
        System.out.printf("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.printf("Data de início: ");
        Date start = sdf.parse(sc.nextLine());
        System.out.printf("Retorno: ");
        Date finish = sdf.parse(sc.nextLine());
        
        Aluguel al = new Aluguel(start, finish, new Veiculo(modelo));
        
        System.out.printf("Preço por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.printf("Preço pro dia: ");
        double precoPorDia = sc.nextDouble();
        
        ServicoAluguel servico = new ServicoAluguel(precoPorDia, precoPorHora, new ImpostoBrasil());
        
        servico.processInvoice(al);
        
        System.out.println("FATURA");
        System.out.println("Pagamento: "+String.format("%.2f",al.getInvoice().getPagamento()));
        System.out.println("Imposto: "+String.format("%.2f", al.getInvoice().getImposto()));
        System.out.println("Total: "+String.format("%.2f", al.getInvoice().getTotalPagamento()));
        
        
    }
    
}
