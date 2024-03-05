package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodiosExemplo2()) {
            System.out.print(episodio + " ");
            
        }

        /*
        Neste exemplo, se executamos sem passar um nome, ele automaticamente chama
        o construtor sem argumentos.
         */

    }
}
