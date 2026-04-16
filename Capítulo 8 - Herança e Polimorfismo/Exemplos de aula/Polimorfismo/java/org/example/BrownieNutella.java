package org.example;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando mais nutella: " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando no carrinho de COMPRAS: " + this.nome);
    }

    @Override
    public void calculaValorTotalCompra() {
        System.out.println("Valor total dos brownies DE NUTELLA ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        this.addCarrinhoDeCompras();
        System.out.println("---------------------");
    }
}
