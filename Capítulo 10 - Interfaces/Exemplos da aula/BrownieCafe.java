package org.example;

public class BrownieCafe extends Brownie implements Promotavel {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Implementando de maneira forçada o método da classe Brownie");
    }

    public void adicionaCafe(){
        System.out.println("Adicionando mais café " + this.nome);
    }

    @Override
    public void aplicaDesconto(double desconto) {
        System.out.println("Aplicando desconto no Brownie de Café");
    }
}
