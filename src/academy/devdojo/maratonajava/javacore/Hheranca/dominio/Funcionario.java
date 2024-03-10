package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario  extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
        /*
        Quanto escrevemos super, estamos nos referindo ao objeto mais genérico;
        nesse caso, estamos nos referindo à superclasse Pessoa.
         */
    }

    /*
    Principal para levar da aula 74: sempre que adicionamos um construtor
    na classe mãe, precisamos alterar também as classes filhas.
     */

    public void relatorioPagamento() {
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
        /*
        posso acessar o nome diretamente aqui (sem usar o getNome) pois marquei
        o atributo lá na super classe como protected.
         */
    }

    /*
    Com heranças como essa, acoplamos fortemente nosso código.
    Neste caso, Funcionário é completamente dependente de pessoa.
    Will: eu evito usar herança. Qualquer tipo de alteração que eu faça
    na classe Pessoa vai gerar uma preocupação também na classe
    Funcionário.
     */

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
