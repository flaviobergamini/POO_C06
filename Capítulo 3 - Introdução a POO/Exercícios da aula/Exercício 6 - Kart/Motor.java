package org.example;

public class Motor {
    public String cilindradas;
    public float velocidadeMaxima;

    public void mostraInfo() {
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
    }
}
