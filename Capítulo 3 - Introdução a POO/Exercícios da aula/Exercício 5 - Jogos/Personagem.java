package org.example;

public class Personagem {
    public String nome;
    public int pontos;
    public Arma arma;

    public void usarArma() {
        this.arma.resistencia -= 2;
    }

    public void tomarDano() {
        this.pontos -= 5;
    }
}
