package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        /*
        estudante.nome = "Gohan";
        (exemplo a não fazer - aula 50)
        As boas práticas dizem: não altere os dados do objeto que você está
        passando no método. Se precisar de algo do tipo, faça uma cópia do
        objeto e retorne um nome objeto com o estado alterado.
        Quando alteramos algo dentro do objeto, estamos mantendo essa
        alteração para as outras referências que ainda têm ligação com
        aquele objeto.
         */
    }
}
