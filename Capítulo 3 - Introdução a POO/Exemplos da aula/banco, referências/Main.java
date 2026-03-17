package org.example;

public class Main {
    public static void main(String[] args) {


        //Conta contaCorrente = new Conta();

        //contaCorrente.saldo = 1000;
        //contaCorrente.nomeDono = "Fernando";

        //System.out.println("Conda de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);

        //contaCorrente.deposito(250);

       //System.out.println("Conda de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);

        //contaCorrente.saque(70);

        //System.out.println("Conda de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);

        //System.out.println("-----------------");

        //Conta contaCorrente2 = new Conta();

        //contaCorrente2.saldo = 3500;
       // contaCorrente2.nomeDono = "Sarah";

        //System.out.println("Conda de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);

       // contaCorrente2.deposito(250);

        //System.out.println("Conda de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);

        //contaCorrente2.saque(70);

        //System.out.println("Conda de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);


        Conta contaCorrente = new Conta();

        contaCorrente.saldo = 1000;
        contaCorrente.nomeDono = "Fernando";

        Conta contaCorrente2 = new Conta();

        contaCorrente2.saldo = 3500;
        contaCorrente2.nomeDono = "Sarah";

        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.nomeDono);

        System.out.println(contaCorrente2.saldo);
        System.out.println(contaCorrente2.nomeDono);

        System.out.println("----------------");

        //contaCorrente2 = contaCorrente;

        //System.out.println(contaCorrente.saldo);
        //System.out.println(contaCorrente.nomeDono);

        //System.out.println(contaCorrente2.saldo);
        //System.out.println(contaCorrente2.nomeDono);

        //if (contaCorrente == contaCorrente2)
        //    System.out.println("São iguais");
        //else
        //    System.out.println("Diferentes");

       // int x = 10;
       // int y = 10;

        //if(x == y)
       //     System.out.println("x e y são iguais");

        contaCorrente.transferir(contaCorrente2, 55);

        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.nomeDono);

        System.out.println(contaCorrente2.saldo);
        System.out.println(contaCorrente2.nomeDono);

    }
}