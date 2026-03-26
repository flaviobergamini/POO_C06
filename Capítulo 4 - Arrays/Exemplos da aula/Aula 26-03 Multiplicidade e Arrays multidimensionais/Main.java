package org.example;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Sarah");
        cliente.setCpf("123.456.789-10");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Flavio");

        conta.addCliente(cliente);
        conta.addCliente(cliente1);

        //conta.listaClientes();

        // Trabalhando com arrays multidimencionais

        int [][] matriz = new int[5][5];

        /*for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + j;
            }
        }*/

        // matriz identidade
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}