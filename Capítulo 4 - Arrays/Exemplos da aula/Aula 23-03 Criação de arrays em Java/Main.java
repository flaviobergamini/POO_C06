package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.nome = "Sarah";
        cliente.cpf = "123.456.789-10";
        cliente.endereco = "Rua 1";

        conta.saldo = 1000;
        //conta.titular = cliente;

        //System.out.println(conta.titular.nome);
        //System.out.println(cliente.nome);

        //System.out.println("Cliente " + conta.titular.nome + " possui R$" + conta.saldo );

        //Empresa empresa = new Empresa();


        // AULA DO DIA 23/03 - ARRAYS

        int x [];
        int y[];
        int [] z = new int[10];
        int []a = {2, 10, 55, 30};

        double [] versoesWndows = {1,0, 2,0, 3.1, 95, 98, 2000};

        int [] vetor = new int[5];

        System.out.println(vetor.toString().getBytes());

        Conta [] contas = new Conta[5];

        Conta conta1 = new Conta();
        contas[0] = conta1;

        contas[1] = new Conta();

        contas[0].saldo = 90;
        contas[1].saldo = 150;

        //System.out.println(contas[0].saldo);
        //System.out.println(conta1.saldo);
        //System.out.println(contas[1].saldo);

        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null)
                System.out.println(contas[i].saldo);
        }

        System.out.println("-----------------");
        for (Conta c: contas) {
            if (c != null)
                System.out.println(c.saldo);
        }

        //versões do Windows
        for(int i = 0; i < versoesWndows.length; i++)
            System.out.println(versoesWndows[i]);

        System.out.println("--------------");

        for(double versao: versoesWndows)
            System.out.println(versao);
    }
}