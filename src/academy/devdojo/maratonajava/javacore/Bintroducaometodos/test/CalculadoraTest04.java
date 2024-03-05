package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTest04:");
        System.out.println("Num 1 "+num1);
        System.out.println("Num 2 "+num2);
        /*
        a variável original de tipo primitivo nunca é alterada, não importa o que
        aconteça dentro do método.
         */


    }
}
