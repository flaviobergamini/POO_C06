package org.example;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bwNutella = new BrownieNutella("Nutella", 10, "Nutella");
        BrownieCafe bwCafe = new BrownieCafe("Café", 11, "Café");
        BrownieDoceDeLeite bwDoce = new BrownieDoceDeLeite("Doce de leite", 9, "Doce de Leite");

        bwCafe.adicionaCafe();
        bwNutella.adicionaNutella();

        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();

        bwDoce.adicionaDoceDeLeite();
        bwDoce.addCarrinhoDeCompras();
        bwDoce.calculaValorTotalCompra();
        bwDoce.mostraInfo();
    }
}