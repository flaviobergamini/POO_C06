package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("String_1");
        conjunto.add("String_2");
        conjunto.add("String_3");
        conjunto.add("String_3");
        conjunto.add("String_4");
        conjunto.add("String_5");

        for(String elemento: conjunto)
            System.out.println(elemento);

        // Remoção
        conjunto.remove("String_2");

        System.out.println(conjunto);

        // Remoção de item com Iterator
        Iterator<String> iterator = conjunto.iterator();

        while (iterator.hasNext()){
            if(iterator.next() == "String_4") {
                iterator.remove();
            }
        }

        System.out.println(conjunto);

        //LinkedHashSet

        Set<String> conjuntoEmOrdem = new LinkedHashSet<>();
        conjuntoEmOrdem.add("String_1");
        conjuntoEmOrdem.add("String_2");
        conjuntoEmOrdem.add("String_3");
        conjuntoEmOrdem.add("String_3");
        conjuntoEmOrdem.add("String_4");
        conjuntoEmOrdem.add("String_5");

        System.out.println("LinkedHashSet:");
        System.out.println(conjuntoEmOrdem);
        conjuntoEmOrdem.remove("String_3");
        System.out.println(conjuntoEmOrdem);

        //  chave , valor
        Map<String, Double> mapa = new HashMap<>();
        mapa.put("Netflix", 29.90);
        mapa.put("Prime Video", 14.00);
        mapa.put("HBOMax", 40.85);

        Double valor = mapa.get("Prime Video");

        if (valor != null)
            System.out.println("Prime Video R$" + valor);
        else
            System.out.println("Valor não encontrado");

        valor = mapa.get("Netflix");

        if (valor != null)
            System.out.println("Netflix R$" + valor);
        else
            System.out.println("Valor não encontrado");

        mapa.put("Netflix", 198.00);
        valor = mapa.get("Netflix");

        if (valor != null)
            System.out.println("Netflix R$" + valor);
        else
            System.out.println("Valor não encontrado");

        System.out.println("Mostrando mapa:");
        mapa.forEach((chave, valor1) -> {
            System.out.println("Chave: " + chave + ", " + valor1);
        });

        System.out.println(conjuntoEmOrdem);
        conjunto.stream().sorted();


        long millis = System.currentTimeMillis();

        Instant instant = Instant.ofEpochMilli(millis);
        LocalDateTime dataHora = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(millis);
        System.out.println(dataHora);
    }
}