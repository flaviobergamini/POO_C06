package org.example;

import teste.Comprador;

public class Main {
    public static void main(String[] args) {
        Brownie bwNutella = new BrownieNutella("Nutella", 10, "Nutella");
        Brownie bwCafe = new BrownieCafe("Café", 11, "Café");
        Brownie bwDoce = new BrownieDoceDeLeite("Doce de leite", 9, "Doce de Leite");

        //int i;
        //double j = 3.14;

        //i = (int) j;
        if (bwCafe instanceof BrownieCafe){
            BrownieCafe cafe = (BrownieCafe) bwCafe;
            cafe.adicionaCafe();
        }

        if (bwNutella instanceof BrownieNutella) {
            BrownieNutella nutella = (BrownieNutella) bwNutella;
            nutella.adicionaNutella();
        }


        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();

        System.out.println("=====================");
        bwCafe.calculaValorTotalCompra();
        bwDoce.calculaValorTotalCompra();
        bwNutella.calculaValorTotalCompra();

        //bwDoce.adicionaDoceDeLeite();
        //bwDoce.addCarrinhoDeCompras();
        //.calculaValorTotalCompra();
        //bwDoce.mostraInfo();

        Comprador comprador = new Comprador();
        comprador.compraBrownie(bwCafe);
        comprador.compraBrownie(bwNutella);
        comprador.compraBrownie(bwDoce);
    }
}