package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 700;
        conta.numeroConta = 12343;
        conta.agencia = 0001;
        conta.limite = 400;

        System.out.println("Na conta " + conta.numeroConta + " tem R$" + conta.saldo);

        conta.deposita(600);

        System.out.println("Na conta " + conta.numeroConta + " tem R$" + conta.saldo);

        conta.saca(400);

        System.out.println("Na conta " + conta.numeroConta + " tem R$" + conta.saldo);

        System.out.println("--------------------------");

        Conta conta2 = new Conta();

        conta2.saldo = 1000;
        conta2.numeroConta = 12343;
        conta2.agencia = 0001;
        conta2.limite = 400;

        System.out.println("Na conta " + conta2.numeroConta + " tem R$" + conta2.saldo);

        conta2.deposita(600);

        System.out.println("Na conta " + conta2.numeroConta + " tem R$" + conta2.saldo);

        conta2.saca(400);

        System.out.println("Na conta " + conta2.numeroConta + " tem R$" + conta2.saldo);
    }
}