package org.example;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(double quantia) {
        if(this.saldo >= quantia) {
            this.saldo -= quantia;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public void deposita(double quantia) {
        this.saldo += quantia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
