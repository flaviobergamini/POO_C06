package org.example;

public abstract class Doce implements Comparable<Doce> {
    public String nome;
    public double preco;

    public Doce (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
