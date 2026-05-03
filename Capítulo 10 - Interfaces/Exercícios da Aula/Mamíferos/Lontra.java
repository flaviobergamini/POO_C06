package org.example;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra está nadando");
    }
}
