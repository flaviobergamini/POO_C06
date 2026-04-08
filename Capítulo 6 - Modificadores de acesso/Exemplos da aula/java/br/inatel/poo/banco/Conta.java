package br.inatel.poo.banco;

public class Conta {
    private double saldo;
    private int numero;
    private double limite;
    private Cliente titular;

    public void saque(double quantia) {
        if (this.saldo >= quantia)
            this.saldo -= quantia;
        else
            System.out.println("Saldo insuficiente");
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double saldo) {
        if (saldo > 0)
            this.saldo += saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    private boolean verificaSerasa() {
        // Faz a consulta no Serasa
        return true;
    }

    public void pedirEmprestimo(double quantia) {
        if (this.verificaSerasa()) {
            System.out.println("Empréstimo aprovado");
        }
    }
}
