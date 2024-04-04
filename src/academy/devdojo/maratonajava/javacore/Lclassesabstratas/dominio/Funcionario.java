package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    /*
    Quando colocamos uma classe como abstrata, definimos que ela é
    um template, ou seja, não podemos mais criar algo concreto
    com ela.

    Métodos abstratos só podem existir dentro de classes abstratas,
    mas uma classe abstrata pode ter tanto métodos concretos quanto
    abstratos.
    */
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
    /*
    Quando temos um método abstrato, ele precisa ser implementado
    por todas as classes que extendem a classe abstrata.
     */

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
