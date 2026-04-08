package br.inatel.poo.matematica;

public class Matematica {
    public int soma(int a, int b) {
        return a+b;
    }

    public double divisao(int a, int b) {
        if (b != 0) {
            return (double)a/b;
        }

        return -1;
    }
}
