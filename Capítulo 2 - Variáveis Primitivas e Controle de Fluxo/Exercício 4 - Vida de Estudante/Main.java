package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Vida de Estudante");

        System.out.println("Entre com a nota da NPA:");
        int npa = teclado.nextInt();

        if (npa >= 60) {
            System.out.println("Aluno APROVADO!");
        }
        else if (npa >= 30 && npa < 60){
            System.out.println("Entre com a nota da NP3:");
            int np3 = teclado.nextInt();

            double nfa = (double)(npa + np3) / 2;

            if (nfa >= 50) {
                System.out.println("Aluno APROVADO pela NP3");
            }
            else {
                System.out.println("Aluno REPROVADO com a NP3");
            }
        }
        else {
            System.out.println("Aluno REPROVADO");
        }
        
        teclado.close();
    }
}