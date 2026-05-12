package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Chris", 123456789);
        Cliente c2 = new Cliente("Renzo", 987654321);
        Cliente c3 = null;

        Set<Cliente> clientes = new HashSet<>();
        clientes.add(c1);
        clientes.add(c2);
        //clientes.add(c3);

        Conta conta = new Conta(400, 50, clientes);

        conta.mostraInfo();

        System.out.println("Fim!!");
    }
}