package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = null;
        /* isso é uma variável do tipo reference, que se diferencia da variável de tipo
        primitivo.
        seria possível também a sintaxe:
        int idades [];
        Por ser uma variável do tipo reference, podemos inicializar com null, pois eles
        servem como referência, mas não apontam automaticamente para algum objeto em memória.
        Dos tipos primitivos, apenas String pode ser inicializado como null.
         */

        idades = new int[3];
        /*
        Em Java, quando declaramos um array, obrigatoriamente precisamos dizer quanto
        de espaço em memória estamos alocando - neste caso, 3.
        Essa variável está agora apontando para um objeto em memória que é um array
        de 3 posições.
         */

        System.out.println(idades);
        /*
        Se simplesmente imprimirmos o array, não vamos ver os valores, mas sim
        um endereço em memória - neste caso, [I@e9e54c2
         */

        System.out.println(idades[1]);
        /*
        O array é naturalmente indexado (posição 0, posição 1, posição 2, etc).
        Mesmo sem atribuir valores, posso imprimir e ver o valor 0, que é o default para
        o tipo primitivo int.
        Caso tentemos com idades[3], vamos ver uma exception, pois a posição 3 no
        array não existe.
         */

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[1]);
        /*
        Agora que associamos valores, podemos imprimi-los.
         */






    }
}
