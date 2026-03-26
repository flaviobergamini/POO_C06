package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.nome = "Rambo";
        personagem.pontos = 10;

        Arma arma = new Arma();
        arma.nome = "Rifle";
        arma.resistencia = 100;

        personagem.arma = arma;

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.pontos);
        System.out.println("Resistência: " + personagem.arma.resistencia);

        System.out.println("------------");
        personagem.tomarDano();
        personagem.tomarDano();

        personagem.usarArma();

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.pontos);
        System.out.println("Resistência: " + personagem.arma.resistencia);
        personagem.tomarDano();

    }
}