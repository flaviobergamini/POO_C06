package br.inatel.poo;  // indica onde o arquivo atual está

import br.inatel.poo.matematica2.Matematica; //indica o local da dependência

public class Main {
    public static void main(String[] args) {

        // Instanciando objeto usando fully qualified name
        br.inatel.poo.matematica.Matematica matematica =
                new br.inatel.poo.matematica.Matematica();

        System.out.println(matematica.soma(1,2));
        System.out.println(matematica.divisao(2,0));
        System.out.println(matematica.divisao(10,2));

        // usando imports
        Matematica matematica2 = new Matematica();
        matematica2.soma(1,2);
        matematica2.divisao(2,0);
        matematica2.divisao(10,2);
    }
}