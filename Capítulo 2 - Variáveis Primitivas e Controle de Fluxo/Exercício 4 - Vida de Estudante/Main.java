package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double notaFinal;

        System.out.println("Entre com a NPA:");
        int npa = teclado.nextInt();

        if (npa >= 60) {
            System.out.println("ALUNO APROVADO!");
            notaFinal = npa;
        }
        else if (npa >= 30 && npa < 60) {
            System.out.println("Entre com a NP3:");

            int np3 = teclado.nextInt();
            double nfa = (npa + np3) / 2;
            notaFinal = nfa;

            if (nfa >= 50) {
                System.out.println("ALUNO APROVADO com NP3!");
            }
            else {
                System.out.println("ALUNO REPROVADO!");
            }
        }
        else {
            System.out.println("ALUNO REPROVADO!");
            notaFinal = npa;
        }
    }
}