package org.example;

public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostraInfoArma() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Resistência: " + this.resistencia);
    }
}
