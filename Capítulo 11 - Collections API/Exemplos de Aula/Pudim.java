package org.example;

public class Pudim extends Doce{

    public Pudim(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int compareTo(Doce o) {
        if(this.preco < o.preco)
            return -1;
        if(this.preco > o.preco)
            return 1;

        return 0;
    }
}
