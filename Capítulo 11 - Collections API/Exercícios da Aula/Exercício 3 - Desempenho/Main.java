package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int quantidade = 100000;

        List<Integer> lista = new ArrayList<>();
        Set<Integer> conjunto = new HashSet<>();
        Map<Integer, Integer> mapa = new HashMap<>();

        long inicio;
        long fim;
        long total;
        double individual;

        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            lista.add(i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;
        individual = (double) total/ (double) quantidade;

        System.out.println("Lista: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");


        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            conjunto.add(i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;
        individual = (double) total/ (double) quantidade;

        System.out.println("Conjunto: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");


        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            mapa.put(i, i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;
        individual = (double) total/ (double) quantidade;

        System.out.println("Mapa: Tempo total: " + total + "ms, Tempo por incersão: " + individual + "ms");

        System.out.println("--------Busca--------");

        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            lista.contains(i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;

        System.out.println("Lista: Tempo total: " + total + "ms");


        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            conjunto.contains(i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;

        System.out.println("Conjunto: Tempo total: " + total + "ms");


        inicio = System.currentTimeMillis();
        for(int i=0; i < quantidade; i++) {
            mapa.get(i);
        }
        fim = System.currentTimeMillis();
        total = fim - inicio;

        System.out.println("Mapa: Tempo total: " + total + "ms");
    }
}