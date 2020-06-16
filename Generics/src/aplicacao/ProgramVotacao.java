/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Matheus
 */
public class ProgramVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> map = new TreeMap<>();

            String line = br.readLine();
            while (line != null) {

                String fields[] = line.split(",");
                String candidato = fields[0];
                int votos = Integer.parseInt(fields[1]);

                if (map.containsKey(candidato)) {

                    int NumVotos = votos + map.get(candidato);

                    map.put(candidato, NumVotos);

                } else {

                    map.put(candidato, votos);
                }
                line = br.readLine();
            }

            map.keySet().forEach((list) -> {
                System.out.println(list + " : " + map.get(list));
            });

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}
