package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);

        int [][] campo = new int[2][2];
        int jogadas = 0;

        int linhaBomba = rand.nextInt(2);
        int colunaBomba = rand.nextInt(2);

        campo[linhaBomba][colunaBomba] = -1;

        System.out.println("Campo Minado");

        while (jogadas < 3) {
            System.out.println("Entre com a posição da linha: ");
            int linha = teclado.nextInt();

            System.out.println("Ente com a posição da coluna: ");
            int coluna = teclado.nextInt();

            if (campo[linha][coluna] == -1) {
                System.out.println("BOOOMMM! ");
                System.out.println("Mina encontrada");
            }
            else {
                System.out.println("Caminho seguro");
                jogadas++;
            }
        }

     // NÃO FAZ PARTE DO EXERCÍCIO
     for(int i=0; i< campo.length;i++) {
         for(int j=0; j <campo[i].length; j++){
             System.out.print(campo[i][j] + " ");
         }
         System.out.println();
     }
    }
}