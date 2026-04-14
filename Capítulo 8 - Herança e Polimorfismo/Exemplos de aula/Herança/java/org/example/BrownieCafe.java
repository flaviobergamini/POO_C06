package org.example;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addMaisCafe(){
        System.out.println("Adicionando mais café");
    }
}
