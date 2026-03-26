package org.example;

public class Conta {
    private double saldo;
    private int numero;
    private double limite;
    private Cliente clientes[] = new Cliente[5];

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

    public void addCliente(Cliente cliente) {
        for(int i = 0; i < this.clientes.length; i++){
            if (this.clientes[i] == null) {
                this.clientes[i] = cliente;
                break;
            }
        }
    }

    public void listaClientes() {
        for(Cliente cliente: this.clientes) {
            if (cliente != null)
                System.out.println(cliente.getNome());
        }
    }
}
