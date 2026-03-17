package org.example;

public abstract class Pessoa {
    String nome;
    int idade;

    void falar () {
        System.out.println("Olá, eu sou " + nome + " tenho " + idade + " anos");
    }
}
