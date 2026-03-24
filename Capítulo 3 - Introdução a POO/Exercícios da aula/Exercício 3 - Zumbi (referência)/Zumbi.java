package org.example;

public class Zumbi {
    public String nome;
    public double nivelFome;
    public double vida;

    public void atacar() {
        System.out.println("Atacando");
    }

    public void resmungar() {
        System.out.println("grrrrrr");
    }

    public double mostraVida() {
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida += quantia;
        zumbiAlvo.vida -= quantia;
    }
}