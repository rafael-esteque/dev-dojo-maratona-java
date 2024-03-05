package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafú");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        /*
        formas diferentes de criar esse array, com o mesmo resultado:
        Jogador[] jogadores = new Jogador[3];
        Jogador[] jogadores = Jogador[]{jogador1, jogador2, jogador3};
         */

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }

    /*
    tipos de associação:

    1 para 1
    (ex: Jogador 1 -- 1 personagem)

    1 para muitos
    (ex: Time 1 -- N Jogador)

    Muitos para 1
    (ex: Jogador N -- 1 time)

    Muitos para muitos
    (ex: Estudante N -- N Curso)
     */
}
