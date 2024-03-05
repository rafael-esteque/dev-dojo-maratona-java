package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    //aula52
    public static void main(String[] args) {
        //poderia ser public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        /*
        É assim que trabalhamos com arrays, mas há uma outra forma de
        representar arrays nas assinaturas, que na verdade foi introduzida
        depois da criação dos arrays em si: var args.
        VarArgs é apenas uma sintaxe que foi criada para deixar as coisas
        um pouco mais simples. O que muda do array para o VarArgs é apenas
        uma questão de sintaxe. É é especialmente útil quando você não sabe
        quantos argumentos serão passados para o método.
         */
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
