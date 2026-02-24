package org.example;
public class Main {
    public static void main(String[] args) {
        var ingressosInteiros = 8;
        var ingressosMeiaEntrada = 5;
        var valorInteiro = 30.00;
        var valorMeia = 15.00;

        var totalInteiro = ingressosInteiros * valorInteiro;
        var totalMeia = ingressosMeiaEntrada * valorMeia;
        var totalSessao = totalInteiro + totalMeia;
        var media = totalSessao / (ingressosInteiros + ingressosMeiaEntrada);

        System.out.println("total arrecadado com ingressos inteiros: " + totalInteiro);
        System.out.println(" total arrecadado com meia-entrada: " + totalMeia);
        System.out.println(" valor total arrecadado na sessão: " + totalSessao);
        System.out.println(" valor médio pago por ingresso: " + media);

    }
}