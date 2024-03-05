package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+numero01);
        System.out.println("O valor é "+numero02+numero01);
        System.out.println(numero02+numero01+" é o valor.");
        System.out.println(numero02+numero01+" é o valor.");
        /*notar difereça entre os 3 prints. O sinal de + é sobrecarregado. Se colocamos
        uma string antes, ele assume que o que vem depois também é string.
         */

        int resto = 20 % 2;
        System.out.println(resto);
        //operador de resto -> útil para verificar se um número é par ou ímpar


        // operadores de comparação SEMPRE retornam valores booleanos: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("isDezIgualVinte = "+ isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println("IsDezIgualDez = "+ isDezIgualDez);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("IsDezDiferenteDez = "+isDezDiferenteDez);
        //não podemos fazer comparação entre tipos incomparáveis, como número e String por exemplo, vamos ter um erro de compilação


        //operadores lógicos
        // && (AND)
        // || (or)
        // !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        //(...)


    }

}
