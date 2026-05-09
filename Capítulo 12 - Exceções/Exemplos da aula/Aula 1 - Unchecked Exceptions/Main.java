package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;

            System.out.println(x/y);
        } catch (Exception e ) {
            System.out.println(e);
        }

        System.out.println("Fim!!!");
        //System.out.println("Início da Main");
        //metodo1();
        //System.out.println("Fim do programa! SUCESSO!!");
       /* Conta conta = new Conta(300, 50);

        boolean sacou = conta.sacar(400);

        if(sacou)
            System.out.println("Saque realizado com sucesso");
        else
            System.out.println("Saque NÃO realizado");


        System.out.println(conta.getSaldo());
        conta.deposita(25);
        System.out.println(conta.getSaldo());*/

    }

    public static void metodo1() {
        System.out.println("Iniciando método 1");
        try {
            metodo2();
        }catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Iniciando método 2");
        //try {
            Conta conta = null;
            conta.deposita(100);
        //} catch (NullPointerException e) {
        //    System.out.println(e);
        //}
        System.out.println("Fim método 2");
    }
}