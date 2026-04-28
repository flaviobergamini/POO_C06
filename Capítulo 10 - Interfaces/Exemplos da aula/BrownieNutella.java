package org.example;

public class BrownieNutella extends Brownie implements Promotavel {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando mais nutella: " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando Brownie de Nutella no carrinho: " + this.nome);
    }

    @Override
    public void aplicaDesconto(double desconto) {
        System.out.println("Aplicando desconto de R$" + desconto);
        System.out.println("No brownie de nutella R$" + (this.preco - desconto));
    }
}
