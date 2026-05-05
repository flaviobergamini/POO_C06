package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDoubles = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            listaDoubles.add(random.nextDouble() * 100);
        }

        for(double elemento : listaDoubles){
            System.out.println(elemento);
        }

        Collections.sort(listaDoubles, Collections.reverseOrder());
        //Collections.sort(listaDoubles);
        //Collections.reverse(listaDoubles);

        System.out.println("---------------------");

        for(double elemento : listaDoubles){
            System.out.println(elemento);
        }
    }
}