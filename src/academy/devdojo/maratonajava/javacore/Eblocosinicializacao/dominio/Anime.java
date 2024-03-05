package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
//    private int[] episodios = {1,2,3,4,5,6,7,8,9};
    private int[] episodiosExemplo2;

    {
        System.out.println("Dentro do bloco de inicialização");
            /*
    Geralmente colocamos os blocs de inicialização antes dos construtores e
    depois dos atributos. Ele vai ser criado toda vez que criarmos uma
    instância do objeto (neste caso, do Anime).
     */

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
        for (int episodio: this.episodiosExemplo2) {
            System.out.print(episodio + "  ");
            /*
            sout sem ln imprime tudo numa linha só
             */
        }
        for (int episodioExemplo2: this.episodiosExemplo2
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
/*
Ordem de execução:
1 - Alocado espaço em memória para o objeto;
2 - Cada atributo de classe é criado e inicializado com valores default
ou o que for passado;
3 - Bloco de inicialização é executado;
4 - Construtor é executado;

A diferença entre um bloco de inicialização e um construtor padrão é que
o bloco é executado independente do construtor que você chamar.
 */
