package org.example;

public class Conta {
    public double saldo;
    public int numero;
    public double limite;
    public Cliente titular;

    public void saque(double quantia) {
        if (this.saldo > quantia)
            this.saldo -= quantia;
    }


    public void deposito(double quantia) {
        this.saldo += quantia;
    }

    public void transferir(Conta contaDestino, double quantia) {
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
