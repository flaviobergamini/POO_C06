package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Tentando ler um arquivo");

        try {
            metodo1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Erro na leitura, prosseguindo com a execução");*/
        Conta conta = new Conta(400, 50);
        //
        try {
            //FileInputStream file = new FileInputStream("config.txt");
            conta.sacar(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Sempre executa!!");
        }

        /*catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        System.out.println("SUCESSO!!");
    }

    public static void metodo1() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("config.txt");
    }
}