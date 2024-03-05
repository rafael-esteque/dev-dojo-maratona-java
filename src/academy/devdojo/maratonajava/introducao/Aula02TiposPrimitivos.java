package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //tipos primitivos são aqueles que guardam em memória um valor simples
        //int, double, float, char, byte, short, long, boolen
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.1f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'm';
        String nome = "Goku";
        //var nome2 = "Vegeta";


        /*os tipos primitivos, com exceção do boolean, são todos numericos, e a diferença entre
        eles é a quantidade de valor que você pode colocar dentro da variável (dentro do
        espaço de memória).
        Cast é forçar o java a colocar o valor de uma variável dentro da outra.
        A string não é um tipo primitivo, mas sim um tipo de referência.  String é uma classe, e portanto começa com letra maiúscula.*/

        System.out.println("A idade é "+idade+"anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome);

    }
}
