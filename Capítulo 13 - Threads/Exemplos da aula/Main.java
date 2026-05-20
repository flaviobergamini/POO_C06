package org.example;

public class Main {
    public static void main(String[] args) {
        GerarMapa geraMapa = new GerarMapa();
        GerarBarraDeProgresso geraBarra = new GerarBarraDeProgresso();

        //geraBarra.rodar();
        //geraMapa.rodar();

        // Criando as threads
        Thread threadMapa = new Thread(geraMapa);
        Thread threadBarra = new Thread(geraBarra);

        // iniciando as threads
        threadMapa.start();
        threadBarra.start();

        // utilizando a herança ao invés da implementação
        //geraMapa.start();

        // Tirando a Raiz Quadrada
        double x = 25;
        double x2 = Math.sqrt(x);

        // Retornando o Seno
        double y = Math.toRadians(30);
        double y2 = Math.sin(y);

    }
}