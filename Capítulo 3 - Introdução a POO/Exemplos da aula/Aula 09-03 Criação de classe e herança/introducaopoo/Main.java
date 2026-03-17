package org.introducaopoo;

public class Main {
    public static void main(String[] args) {
        Pessoa Renzo = new Pessoa();

        Renzo.nome = "Renzo Mesquita";
        Renzo.idade = 35;

        //Renzo.falar();

        Professor ProfessorPoo = new Professor();

        ProfessorPoo.nome = "Justino";
        ProfessorPoo.idade = 70;
        ProfessorPoo.disciplina = "Radio";

        //ProfessorPoo.falar();
        //ProfessorPoo.ministraAula();

        Engenheiro Eng = new Engenheiro();

        Eng.categoria = "Civil";
        Eng.idade = 29;
        Eng.nome = "Maria";
        Eng.disciplina = "Resistência dos Materiais";
        Eng.falar();
        Eng.ministraAula();
        Eng.constroi();
    }
}