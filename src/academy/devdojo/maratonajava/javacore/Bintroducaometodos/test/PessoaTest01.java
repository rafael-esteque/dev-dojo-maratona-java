package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;
import org.w3c.dom.ls.LSOutput;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
//        pessoa.nome = "Jiraya";
        pessoa.setIdade(70);
//        pessoa.imprime();
        System.out.println("nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
    }
}
