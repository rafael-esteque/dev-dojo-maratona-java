package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        /*
        obs. feita ao final da aula: importante saber que os arrays
        multidimensionais existem, mas são pouco usados. No mundo real,
        temos algo mais poderoso, que são as collections e maps.
        */
        //inicializando de jeitos diferentes

        int[] array4 = {4, 3, 2, 1};

        int[][] arrayInt = new int[4][];

        //considerando arrays com tamanhos diferentes
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[6];
        arrayInt[3] = array4;

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }

        //outra forma ainda:
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
