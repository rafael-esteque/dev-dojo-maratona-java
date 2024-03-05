package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        /*
        Embora tenha (), o Anime() abaixo não é um método, e sim um construtor.
         */
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime2.setNome("Yuyu");

        anime.imprime();
        anime2.imprime();
    }
}
