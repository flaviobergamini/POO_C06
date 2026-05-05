package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Bisteca", 5));

        Cachorro cachorro = new Cachorro("Totó", 3);
        animais.add(cachorro);

        animais.add(new Gato("Miau", 2));
        animais.add(new Gato("Bichano", 10));

        animais.add(new Galinha("Galinha", 1));
        animais.add(new Galinha("Franguinho", 7));

        for(Animal animal : animais) {
            System.out.println(animal.nome + " : " + animal.idade);
        }

        Collections.sort(animais);
        System.out.println("------------------");
        for(Animal animal : animais) {
            System.out.println(animal.nome + " : " + animal.idade);
        }

        Animal maxAnimal = Collections.max(animais);
        Animal minAnimal = Collections.min(animais);

        System.out.println("Max:" + maxAnimal.idade);
        System.out.println("Min:" + minAnimal.idade);
    }
}