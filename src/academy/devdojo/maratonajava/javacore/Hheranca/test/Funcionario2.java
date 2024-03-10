package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {

    public Funcionario2(String nome) {
        super(nome);
    }
    public void imprime() {
        this.nome = "sasa";
        /*
        Temos acesso diretamente ao atributo nome, como se fosse público,
        mesmo fora do pacote dominio, pois a classe Funcionário2 extende
        a super classe Pessoa.
         */
    }
}
