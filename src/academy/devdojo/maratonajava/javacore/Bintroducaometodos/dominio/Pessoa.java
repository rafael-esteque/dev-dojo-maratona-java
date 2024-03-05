package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    //alta coesão é quando uma classe faz pouca coisa, o que é desejável
    //acoplamento é o quanto uma classe conhece da outra

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(idade);
        /*
        não necessariamente precisariamos colocar o this, pois não há outra
        variável com o mesmo nome aqui. Para exemplificar, deixei o nome
        com this e o idade sem. Mas é uma boa prática colocar.
         */
    }

    public void setNome(String nome) {
        this.nome = nome;
                /*
        a partir do momento que coloquei o atributo nome como private
        lá em cima, preciso desse método setNome para acessá-lo.
        Mas ai, como faço para proteger?
         */
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
