package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();

        //pessoa.nome = "Sarah";
        //pessoa.idade = 28;

        //pessoa.falar();

        Professor professor = new Professor();
        professor.nome = "Marisa";
        professor.idade = 28;
        professor.disciplina = "Matemática";

        professor.falar();
        System.out.println(professor.leciona());


        //Professor2 prof2 = new Professor2();

        //Monitor monitor = new Monitor();

        Faculdade faculdade = new Faculdade(professor);

        faculdade.nome = "Inatel";

        faculdade.ministraAulas();

    }
}