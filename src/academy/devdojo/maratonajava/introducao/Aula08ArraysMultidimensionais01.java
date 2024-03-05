package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        //o primeiro array precisa ter o tamanho definido, o segundo não necess.

        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("usando o for: " + dias[i][j]);
            }
        }

        //o mesmo array agora com foreach:
        for (int[] arrBase:dias) {
            for (int num: arrBase) {
                System.out.println("usando o forach: " + num);
            }
        /*
        Primeiro declaramos que cada posição do foreach é um array de inteiros.
        Então seria: para cada array de int arrBase (variável local que estou
        criando) do array dias, faça o outro for, que para cada int num do
        arrBase, faz uma nova impressão.
        Esse arrBase é apenas uma variável de referência, que existe enquanto
        for necessária para o foreach.
         */
        }
    }
}
