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

    public String getNome() {
        return nome;
    }
}
