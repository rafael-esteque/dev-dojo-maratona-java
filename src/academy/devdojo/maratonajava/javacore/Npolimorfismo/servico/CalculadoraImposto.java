package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

/*
Como não estamos acessando nenhum atributo de classe, podemos transformar
nossos métodos em estáticos.
 */

public class CalculadoraImposto {

//     Comentei durante aula 92
//    public static void calcularImpostoComputador (Computador computador) {
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Comptador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto a ser pago " + imposto);
//    }
//
//    public static void calcularImpostoTomate (Tomate tomate) {
//        System.out.println("Relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate " + tomate.getNome());
//        System.out.println("Valor " + tomate.getValor());
//        System.out.println("Imposto a ser pago " + imposto);
//    }

    //Refatorando na aula 92:
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: " +produto.getValor());
        System.out.println("Imposto a ser pago: " +imposto);

        //Aula 93
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}
