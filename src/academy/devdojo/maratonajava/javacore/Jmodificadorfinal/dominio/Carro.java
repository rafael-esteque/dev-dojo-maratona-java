package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    /*
    Em java, constantes são definidas pela palavra final. São valores que não
    queremos que mudem. A convenção é escrever em upper case com underscore.
     */

    public final Comprador COMPRADOR = new Comprador();
    /*
    Estamos dizendo aqui que a referência que essa variável tem para esse
    objeto nunca poderá ser alterada.
     */

    public final void imprime() {
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
