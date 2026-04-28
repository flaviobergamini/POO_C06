package org.example;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando mais doce de leite " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando Brownie de Doce de Leite no carrinho: " + this.nome);
    }

}
