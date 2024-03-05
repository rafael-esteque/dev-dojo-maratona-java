package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        Padrões de inicialização dos elementos dos arrays de acordo com
        o tipo de variável:
        byte, short, int, long, float e double -> 0
        char -> '\u0000' ' '
        boolean false
        String null
         */

        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
            
        }

        /*
        Cuidado: o tamanho do array não pode aumentar dinamicamente, então
        todas as vezes que nós quisermos aumentar o tamanho do array,
        precisamos compilar o programa novamente.
        Não podemos simplesmente trocar, em tempo de execução, o tamanho
        de um array.
        É por isso que os arrays são objetos reference, e não tipos primitivos;
        Isso nos dá algumas alternativas.
        Por exemplo: podemos usar no segundo parâmetro do loop do for:
        i < nomes.length;
         */
    }
}
