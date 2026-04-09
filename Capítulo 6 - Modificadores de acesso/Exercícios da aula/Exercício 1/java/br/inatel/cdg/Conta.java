package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    public Cliente [] clientes = new Cliente[100];

    public void sacar(float quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(float quantia) {
        this.saldo += quantia;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
