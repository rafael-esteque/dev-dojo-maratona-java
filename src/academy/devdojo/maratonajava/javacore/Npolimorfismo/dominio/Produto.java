package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;


/*
Dominio é a mesma coisa que MODELO na arquitetura MVC.
A questão é separar  regra de negócio do seu domínio (que representa o banco
de dados) e do que você vai visualizar.
 */

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
