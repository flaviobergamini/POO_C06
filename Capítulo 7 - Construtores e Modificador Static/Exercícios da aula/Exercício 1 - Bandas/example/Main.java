package org.example;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Faroeste Coboclo", 8);

        Membro membro = new Membro("Renato Russo", "Vocalista");

        Banda banda = new Banda("Legião Urbana", "Rock");
        banda.addMembroNovo(membro);
        banda.addMusicaNova(musica);

        banda.mostraInfo();
    }
}