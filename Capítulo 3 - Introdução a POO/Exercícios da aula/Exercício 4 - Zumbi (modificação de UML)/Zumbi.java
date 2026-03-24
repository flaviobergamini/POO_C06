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

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (zumbiAlvo.vida > quantia) {
            this.vida += quantia;
            zumbiAlvo.vida -= quantia;
            return true;
        } else {
            System.out.println("Sem vida");
            return false;
        }
    }
}
