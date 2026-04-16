package org.example;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionando mais café " + this.nome);
    }

    @Override
    public void calculaValorTotalCompra() {
        System.out.println("calculaValorTotalCompra");

        System.out.println("---------------------");
    }
}
