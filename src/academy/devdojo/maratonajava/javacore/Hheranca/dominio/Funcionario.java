package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario  extends Pessoa {
    private double salario;

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
