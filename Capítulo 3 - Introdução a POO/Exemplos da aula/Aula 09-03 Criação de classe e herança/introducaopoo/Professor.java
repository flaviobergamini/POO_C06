package org.introducaopoo;

public class Professor extends Pessoa{
    String disciplina;

    void ministraAula() {

        System.out.println("Aula de " + disciplina);
    }
}
