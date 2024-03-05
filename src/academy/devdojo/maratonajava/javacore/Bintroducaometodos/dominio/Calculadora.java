package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
a 1a parte sempre é o modificador de acesso (public)
a 2a é o retorno (void ou String ou)
Não confundir retorno com saída
a 3a é nome, sempre começando com minúscula

A diferença entre atributos e métodos é que nos atributos não temos ()
e usamos = para atribuir valor, já nos métodos colocamos .nome()

Tanto métodos quanto atributos são executados NO OBJETO
 */

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    /*Aula 45: adicionando parâmetros
    Parâmetros nada mais são do que variáveis locais, que vão estar vivas durante
    o contexto do método nas quais foram declaradas.
    Quando passo para o método inicialmente, chamo de PARÂMETRO; mas quando passo
    para execução na chamada do método, chamo de ARGUMENTO.

    Uma regrinha de boas práticas: geralmente, considera-se que se você tem uma função
    ou método com mais de 3 argumentos, significa que esta função ou método está
    fazendo muita coisa, então você tecnicamente poderia dividir em métodos menores.
     */

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    //uma forma diferente de fazer a mesma coisa, com else:
    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    // também podemos usar o retorno em métodos void:
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
            //neste caso o return serve como um break
        }
        System.out.println(num1 / num2);
    }
    /*
    W. Suane: programação é algo individual, com experiência você cria seu
    próprio estilo. Pessoalmente, eu prefiro parar a execução do método
    logo no começo e depois a execução da lógica de negócio, mas tem gente
    que prefere fazer o if/else.
     */

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros:");
        System.out.println("Num 1 " + num1);
        System.out.println("Num 2 " + num2);
                /*
        Quando passamos valores do tipo primitivo para um método, não estamos
        passando a referência daquele objeto em memória, e sim fazendo
        uma cópia. Por isso nesse caso o java já indica que os parâmetros
        passados no método poderiam ser convertidos em variáveis locais.
         */
    }

    //aula 52
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        /*
        com varArgs, se tivermos mais de uma tributo, ele deve ser sempre
        o último.
         */
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
