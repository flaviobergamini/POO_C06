package org.example;

public abstract class Animal implements Comparable<Animal>{
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
