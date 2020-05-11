/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Matheus
 */
public class Mat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("LINHAS:");
        int m = sc.nextInt();
        System.out.printf("COLUNAS:");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.printf("LINHA %d | COLUNA %d: ", i, j);
                mat[i][j] = sc.nextInt();
                System.out.println();
            }
            
            System.out.printf("<-------------------------->\n");
        }

        System.out.printf("ELEMENTO DA MATRIZ:");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == x) {

                    System.out.printf("POSIÇÃO: %d, %d\n", i, j);

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }

        }
        
        sc.close();
    }

}
