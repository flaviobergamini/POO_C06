package org.example;

public class Professor extends Pessoa{
    String disciplina;

    String leciona() {
        return "Ensina " + disciplina;
    }

    @Override
    public void falar() {
        System.out.println("Mudei de disciplina");
    }
}
