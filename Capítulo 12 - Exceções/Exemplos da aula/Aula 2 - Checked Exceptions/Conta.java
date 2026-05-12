package org.example;

import java.util.Set;

public class Conta {
    private double saldo;
    private double limite;
    Set<Cliente> clientes;

    public Conta(double saldo, double limite, Set<Cliente> clientes) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = clientes;
    }

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException{
        if(this.saldo >= quantia) {
            this.saldo -= quantia;
            System.out.println("Saque realizado com sucesso");
        } else {
            //System.out.println("Saldo insuficiente");
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
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

    public void mostraInfo(){
        try {
            System.out.println("Saldo: R$" + this.saldo);
            System.out.println("Limite: R$" + this.limite);

            for(Cliente c: clientes) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("CPF: " + c.getCpf());
                System.out.println("---------------------");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
