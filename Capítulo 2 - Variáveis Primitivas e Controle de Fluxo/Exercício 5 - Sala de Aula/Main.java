package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com a quantidade de alunos:");
        int qtd = teclado.nextInt();

        switch (qtd) {
            case 10:
            case 20:
                System.out.println("I-5");
                break;
            case 30:
                System.out.println("I-6");
                break;
            default:
                System.out.println("Sala indefinida");
        }
    }
}