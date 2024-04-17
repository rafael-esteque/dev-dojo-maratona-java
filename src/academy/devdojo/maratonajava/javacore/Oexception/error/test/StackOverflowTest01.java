package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
    }

    public static void recursividade() {
        recursividade();
    }
}

/*
Throwable tem duas filhas: Error e Exception
Há exceções checadas e não checadas
 */
