package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodiosExemplo2;
    /*
    Ao adicionar o "static", episodiosExemplo2 se torna um atributo de classe e não
    mais de instância, passa a pertencer a Anime, independente da quantidade de
    objetos que tivermos.
     */

    static {
        System.out.println("\nDentro do bloco de inicialização");

        episodiosExemplo2 = new int[100];
        for (int i = 0; i < episodiosExemplo2.length; i++) {
            episodiosExemplo2[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
//        System.out.println(episodios);
        for (int episodio: Anime.episodiosExemplo2) {
            System.out.print(episodio + "  ");
        }
        for (int episodioExemplo2: Anime.episodiosExemplo2
             ) {
            System.out.print(episodioExemplo2 + " ");

        }
    };

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodiosExemplo2;
    }

    public int[] getEpisodiosExemplo2() {
        return episodiosExemplo2;
    }
}
