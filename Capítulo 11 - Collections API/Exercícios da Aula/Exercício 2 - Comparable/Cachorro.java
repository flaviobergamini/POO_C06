package org.example;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
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
