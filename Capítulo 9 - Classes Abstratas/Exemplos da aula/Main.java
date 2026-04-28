package org.example;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bwNutella = new BrownieNutella("Nutella", 10, "Nutella");
        BrownieCafe bwCafe = new BrownieCafe("Café", 11, "Café");
        Brownie bwDoce = new BrownieDoceDeLeite("Doce de leite", 9, "Doce de Leite");

        Comprador c = new Comprador("Ozzy", 300);
        c.efetuarCompra(bwCafe);
        c.efetuarCompra(bwNutella);

        Brownie bwLeite = new BrownieNutellaLeite("Brownie Nutella Leite", 15, "Nutella com leite ninho");
        BrownieNutella bwLeite1 = new BrownieNutellaLeite("Brownie Nutella Leite", 15, "Nutella com leite ninho");
        BrownieNutellaLeite bwLeite2 = new BrownieNutellaLeite("Brownie Nutella Leite", 15, "Nutella com leite ninho");

        bwLeite2.AdicionaMaisLeiteNinho();  // método local
        bwLeite2.adicionaNutella(); // método da primeira herança
        bwLeite2.addCarrinhoDeCompras(); // método da segunda herança
    }
}