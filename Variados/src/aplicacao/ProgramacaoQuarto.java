/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Quarto;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class ProgramacaoQuarto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] room = new Quarto[10];

        System.out.printf("Númro de estudantes para alugar quartos: ");
        int n = sc.nextInt();

        for (int i = 1; i < (n + 1); i++) {

            System.out.printf("Locatário #%d\n", i);
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();
            System.out.printf("Quarto: ");
            int quarto = sc.nextInt();

            room[quarto] = new Quarto(nome, email, quarto);

        }
        System.out.println("Quartos ocupados:\n");
        for (Quarto room1 : room) {
            if (room1 != null) {
                System.out.println(room1);
            }
        }

    }

}
