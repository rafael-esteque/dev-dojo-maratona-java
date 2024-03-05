package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //parte03 da aula 05 (não copiei as duas primeiras)
        //operador ternário
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //condição: doar se salário for maior que 5000
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        //outra sintaxe (menos recomendável:)
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

        //ainda mais simples:
        System.out.println(salario < 5000 ? "Não tenho condições..." : "Vou doar quinhentão!");

        //com 3 ifs, não recomendável, mas possível:
        int idade = 16;
        String categoria;
        categoria = idade < 15 ? "Categoria Intanfil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

        //o ideal é usar ternários apenas com if simples



    }
}
