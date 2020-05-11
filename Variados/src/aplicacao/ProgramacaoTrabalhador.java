/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Departamento;
import entidades.HorasContrato;
import entidades.Trabalhador;
import entidadesEnum.Nivel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoTrabalhador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Nome do departamento:");
        String nomeDepartamento = sc.nextLine();
        System.out.printf("Nome do trabalhador: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.printf("Nível: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.printf("Salario base: ");
        double baseSalaryo = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador,Nivel.valueOf(nivelTrabalhador),baseSalaryo, new Departamento(nomeDepartamento));
        
        System.out.printf("Número de contratos:");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++){
            
            System.out.println("Contrato número #"+i+" data");
            System.out.printf("Data (DD/MM/YYYY):");
            Date dataContrato = sdf.parse(sc.next());
            System.out.printf("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.println("Duração (horas)");
            int horas = sc.nextInt();
            HorasContrato contratos = new HorasContrato(dataContrato,valorPorHora,horas);
            trabalhador.adicionarContrato(contratos);
        }
        
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular os ganhos (MM/YYYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0,2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.printf("\nNome: ", trabalhador.getName());
        System.out.printf("\nDepartamento: ", trabalhador.getDepartamento().getName());
        System.out.println("\nGanhos para "+mesEano+": "+String.format("%.2f", trabalhador.ganhos(ano, mes)));
    
    }
    
}
