package org.example;

public class Bloco {
    public static int numBlocos;

    public Bloco() {
        numBlocos++;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }
}
