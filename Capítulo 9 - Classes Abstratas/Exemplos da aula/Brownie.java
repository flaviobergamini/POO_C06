package org.example;

public abstract class Brownie extends Doce {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public abstract void addCarrinhoDeCompras();

    public void calculaValorTotalCompra() {
        System.out.println("Valor total dos brownies ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("---------------------");
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Preço: " + this.preco);
    }
}
