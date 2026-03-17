package org.example;

public class Professor2 extends Pessoa {
    public String disciplina;
    private int[] notas;
    protected String[] materiais;

    public String leciona() {
        return "Ensina " + disciplina;
    }
}
