package org.example;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando no carrinho: " + this.nome);
    }

    public void calculaPrecoTotal() {
        System.out.println("Valor total dos brownies");
    }
}
