package academy.devdojo.maratonajava.javacore.Aintroducalclasses.test;
/*
De agora em diante, as classes test vão ser aquelas que contém o método main
 */

import academy.devdojo.maratonajava.javacore.Aintroducalclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        /*
        Imaginem a variável de referência como um controle remoto: quando eu
        coloco o ponto+nome, estou acessando diretamente o espaço de memória
        "nome".
        */
        estudante.idade = 21;
        estudante.sexo = 'M';
        //a variável de referência "sabe" da existência do objeto inteiro

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
