package org.example;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        System.out.println("Criando instância de Pessoa com 2 parâmetros");
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Criando instância de Pessoa com 1 parâmetro");
    }

    public Pessoa() {
        System.out.println("Criando instância de pessoa SEM parâmetro");
    }


}
