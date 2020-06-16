/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Matheus
 */
public class ProgramPipelineSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            List<Employee> list = new ArrayList<>();

            String path = "C:\\Users\\Matheus\\Desktop\\Arquivos TXT\\salario.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line = br.readLine();
                while (line != null) {
                    String dados[] = line.split(",");
                    list.add(new Employee(dados[0],dados[1], Double.parseDouble(dados[2])));
                    line = br.readLine();

                }
                
                System.out.printf("Enter salary: ");
                double salary = sc.nextDouble();
                
                Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
                List<String> email = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
                System.out.println("Email of people whose salary is more than 2000.00: ");
                email.forEach(System.out::println);
               
                double sum = list.stream().filter(p -> p.getName().charAt(0)== 'M').map(p -> p.getSalary()).reduce(0.0,(x,y)->x+y);
                System.out.println("Sum of salary of people whose name starts with 'M': "+String.format("%.2f", sum));
                
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }   
