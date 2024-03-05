package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    /*
    Quando adicionamos esse "static" ao velocidadeLimite, estamos
    dizendo que esse atributo pertence ao Carro, como se fosse
    um metadado. É um identificador que está relacionado
    à classe Carro em si, e não às suas instâncias.
     */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade máxima "+this.velocidadeMaxima);
        System.out.println("Velocidade limite "+Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
        /*
        lembrar: o this sempre se refere ao objeto; como há a possibilidade
        de o objeto não ter sido criado em memória, não podemos usar o this
        aqui no método estático.
         */
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
        /*
        poderia ser apenas return velocidade limite, já que não existe nenhuma
        variável com escopo local sobrescrevendo o nome que temos aqui, que é
        velocidadeLimite.
        O java sempre dá prioridade para a variável local com menor escopo, ou
        seja, o escopo mais próximo da que você está utilizando.
         */
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
