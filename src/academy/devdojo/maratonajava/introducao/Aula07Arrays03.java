package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        //uma outra forma de inicializar:
        int[] numeros2 = {1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // outra forma ainda seria:
        int[] numeros3 = new int[]{1,2,3,4,5};

        /*
        agora vamos ver o for each:
         */
        for(int num:numeros3) {
            System.out.println(num);
        }
        /*
        Obs: tanto no for quanto no for each, a variável local que serve de
        índice deve seguir o mesmo tipo do array.
         */
    }
}
