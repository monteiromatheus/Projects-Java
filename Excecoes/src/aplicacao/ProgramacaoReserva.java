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
import model.entidades.Reserva;
import model.exception.DomainException;

/**
 *
 * @author Matheus
 */
public class ProgramacaoReserva {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.printf("Número do quarto: ");
            int numero = sc.nextInt();
            System.out.printf("CheckIn: ");
            Date checkin = sdf.parse(sc.next());
            System.out.printf("CheckOut: ");
            Date checkout = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numero, checkin, checkout);
            System.out.println("Reserva: " + reserva.toString());
            System.out.println("");
            System.out.println("Atualização das datas de CheckIn e CheckOut:");
            System.out.printf("CheckIn: ");
            checkin = sdf.parse(sc.next());
            System.out.printf("CheckOut: ");
            checkout = sdf.parse(sc.next());
            
            reserva.updateData(checkin, checkout);
            System.out.println("Reserva: " + reserva.toString());
        }
        
        catch(ParseException e){
            
            System.out.println("Formato de data inválido");
        }
        
        catch(DomainException e){
            
            System.out.println("Erro na reserva: "+e.getMessage());
        }
        
    }

}
