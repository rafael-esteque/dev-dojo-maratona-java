package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        /*
        Embora tenha (), o Anime() abaixo não é um método, e sim um construtor.
         */
        Anime anime = new Anime();
        /*
        anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        Estas três linhas são substituídas pela próxima, uma vez que defini
        o método init lá na classe base.
         */
        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();
    }
}
