package org.example;

public class Cantina {
    public String nome;
    Salgado [] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado) {
        for(int i = 0; i < this.salgados.length; i++) {
            if(this.salgados[i] == null) {
                this.salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println(this.nome);
        System.out.println("Salgados: ");
        for (int i = 0; i < this.salgados.length; i++) {
            if (this.salgados[i] != null)
                System.out.println(this.salgados[i].nome);
        }
    }
}
