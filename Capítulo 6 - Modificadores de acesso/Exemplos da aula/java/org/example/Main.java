package org.example;

import br.inatel.poo.banco.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        //conta.saque(1000);

        //conta.pedirEmprestimo(200);

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getIdade());
        pessoa.setIdade(-50);
        System.out.println(pessoa.getIdade());
        pessoa.setIdade(25);
        System.out.println(pessoa.getIdade());

    }
}