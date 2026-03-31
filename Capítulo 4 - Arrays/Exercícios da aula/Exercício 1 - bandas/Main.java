package org.example;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.nome = "Black Sabbath";
        banda.genero = "Heavy Metal";

        Musica musica1 = new Musica();
        musica1.nome = "Paranoid";

        Musica musica2 = new Musica();
        musica2.nome = "Iron Man";

        Membro membro1 = new Membro();
        membro1.nome = "Ozzy Osbourne";

        Membro membro2 = new Membro();
        membro2.nome = "Tony Iommy";

        Empresario empresario = new Empresario();
        empresario.nome = "Saron Osbourne";

        banda.addEmpresario(empresario);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);

        banda.mostraInfo();

    }
}