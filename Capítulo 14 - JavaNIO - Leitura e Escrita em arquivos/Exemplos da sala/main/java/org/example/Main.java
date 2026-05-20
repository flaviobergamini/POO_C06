package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Path arquivo = Paths.get("C:/Users/fhmbe/IdeaProjects/javanio/src/documento.txt");

        Path nome = arquivo.getFileName();
        Path caminho = arquivo.getParent();

        //System.out.println("Nome: " + nome);
        //System.out.println("Caminho: " + caminho);

        Map<String, String> documento = new HashMap<>();

        try {
            List<String> conteudo = Files.readAllLines(arquivo);

            conteudo.forEach((linha) -> {
                String[] linhaQuebrada = linha.split(":");
                documento.put(linhaQuebrada[0], linhaQuebrada[1]);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*documento.forEach((chave, valor) -> {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + valor);
            System.out.println("-------------------");
        });*/

        //System.out.println(documento.get("Faculdade"));

        // Buscando o arquivo completo em uma string
        try {
            String conteudoString = Files.readString(arquivo);
            System.out.println(conteudoString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.writeString(arquivo, "Bairro:Inatel\r\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}