package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }
    private static int divisao(int a, int b) {
        /*
        dividir por 0 cria uma ArithmeticException, que extende Runtime,
        ou seja, não somos obrigados a tratar, mas podemos
        se quisermos.
         */
        try{
            return a/b;
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /*
    outra opção (testei em b):
    public static void main (String[] args) {
    divisao(1, 0);
    System.out.println("Código finalizado");
    }
    private static int divisao (int a, int b) throws IllegalArgumentException{
        if(b == 0) {
            throw new RuntimeException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
        }
     */

    /*
    Sempre bom lançar exceções do modo mais específico possível,
    de modo que quando outra pessoa vá manipular nosso código ela
    sempre entenda o que está acontecendo.
     */
}
