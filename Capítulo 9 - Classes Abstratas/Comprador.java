package org.example;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie) {
        if (this.saldo >= brownie.preco) {
            System.out.println(this.nome + " efetuou compra do brownie:" + brownie.nome);
            this.saldo -= brownie.preco;
            System.out.println("Saldo final: " + this.saldo);
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
        }
        else
            System.out.println("Saldo insuficiente");
    }
}
