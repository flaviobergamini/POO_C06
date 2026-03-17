package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int x = aleatorio.nextInt(10) + 1;
        int numero = -1;

        while(x != numero) {
            System.out.println("Informe um número:");
            numero = teclado.nextInt();

            if(numero < x)
                System.out.println("VALOR MENOR");

            if (numero > x)
                System.out.println("VALOR MAIOR");

            if (x != numero)
                System.out.println("VOCÊ ERROU");
        }

        System.out.println("VOCÊ ACERTOU");
    }
}