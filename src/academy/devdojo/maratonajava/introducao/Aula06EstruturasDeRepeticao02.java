package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        // É possível resolver com qualquer uma das estruturas de repetição



        int count = 0;
        for (count = 1; count <= 100; count ++) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }

    }
}
