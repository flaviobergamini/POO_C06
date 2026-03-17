package org.example;

public class Faculdade {
    public String nome;
    private Professor professor;

    public Faculdade(Professor professor) {
        this.professor = professor;
    }

    public void ministraAulas() {
        System.out.println(professor.leciona());
    }
}
