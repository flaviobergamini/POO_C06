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

        Empresa empresa = new Empresa();

    }
}