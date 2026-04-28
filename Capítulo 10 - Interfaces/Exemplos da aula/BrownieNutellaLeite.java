package org.example;

public class BrownieNutellaLeite extends BrownieNutella {

    public BrownieNutellaLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void AdicionaMaisLeiteNinho() {
        System.out.println("Adicionando mais leite ninho");
    }
}
