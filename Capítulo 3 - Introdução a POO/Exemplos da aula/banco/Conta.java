package org.example;

public class Conta {
    //Atributos
    public double saldo;
    public double limite;
    public int agencia;
    public int numeroConta;

    //Métodos
    public void deposita(double quantia) {
        this.saldo = this.saldo + quantia;
        //this.saldo += quantia;
    }

    public void saca(double quantia) {
        this.saldo = this.saldo - quantia;
    }
}
