package org.example;

public class Main {
    public static void main(String[] args) {

        // Exemplos para Construtores
        /*Pessoa pessoa = new Pessoa("Ozzy Osbourne", 80);
        Pessoa pessoa1 = new Pessoa("Ronnie James Dio");
        Pessoa pessoa2 = new Pessoa();*/

        //Exemplo para modificador Static
        //Bloco b1 = new Bloco();
        //Bloco b2 = new Bloco();
        //Bloco b10 = new Bloco();
        //System.out.println(b2.getNumBlocos());
        //System.out.println(b1.getNumBlocos());
        System.out.println(Bloco.getNumBlocos());
        Bloco.numBlocos = 100;
        System.out.println(Bloco.numBlocos);
        //System.out.println(b2.getNumBlocos());
        //System.out.println(b1.getNumBlocos());
        System.out.println(Bloco.getNumBlocos());

        // Explorando a classe String como exemplo de uso do Static
        //String.format()
    }
}