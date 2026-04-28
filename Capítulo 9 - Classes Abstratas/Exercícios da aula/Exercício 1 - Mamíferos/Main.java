package org.example;

public class Main {
    public static void main(String[] args) {
        Boi boi = new Boi("Mimosa", 3);
        Cachorro cachorro = new Cachorro("Totó", 4);
        Lontra lontra = new Lontra("Lontra", 7);

        boi.emitirSom();
        cachorro.emitirSom();
        lontra.emitirSom();
        System.out.println("------------------");
        boi.mostraInfo();
        System.out.println("------------------");
        cachorro.mostraInfo();
        System.out.println("------------------");
        lontra.mostraInfo();
    }
}