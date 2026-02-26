package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas = 3;

        System.out.print("Entre com a qtd de lanche da primeira hora: ");
        int primeiraHora = teclado.nextInt();
        System.out.print("Entre com a qtd de lanche da segunda hora: ");
        int segundaHora = teclado.nextInt();
        System.out.print("Entre com a qtd de lanche da terceira hora: ");
        int terceiraHora = teclado.nextInt();

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media =  (double) soma / horas;

        System.out.println("-----Resultados-----");
        System.out.println("Total: " + soma);
        System.out.printf("Média: %.2f", media);
    }
}