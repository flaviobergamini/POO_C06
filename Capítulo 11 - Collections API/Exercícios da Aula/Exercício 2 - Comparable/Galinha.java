package org.example;

public class Galinha extends Animal{
    public Galinha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public int compareTo(Animal o) {
        if (this.idade < o.idade)
            return -1;

        if (this.idade > o.idade)
            return 1;

        return 0;
    }
}
