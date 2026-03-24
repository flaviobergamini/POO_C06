package org.example;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        var zumbi1 = new Zumbi();

        zumbi.resmungar();
        zumbi.atacar();

        zumbi.vida = 9;
        zumbi1.vida = 12;

        double vidaZumbi = zumbi.mostraVida();
        System.out.println("Vida do Zumbi: " + vidaZumbi);

        double vidaZumbi1 = zumbi1.mostraVida();
        System.out.println("Vida do Zumbi1: " + vidaZumbi1);

        System.out.println("---------------");
        zumbi = zumbi1;
        zumbi.transfereVida(zumbi1, 5);
        zumbi1.transfereVida(zumbi, 3);

        System.out.println("Vida do Zumbi: " + zumbi.mostraVida());
        System.out.println("Vida do Zumbi1: " + zumbi1.mostraVida());
    }
}