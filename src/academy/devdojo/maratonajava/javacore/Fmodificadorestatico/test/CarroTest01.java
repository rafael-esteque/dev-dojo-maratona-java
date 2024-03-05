package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        //Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();

        /*O que nós precisamos aqui é uma propriedade que seja
        independente do objeto, queremos algo que afete a
        instância em si do Carro, e os objetos que serão
        criados. Queremos um modificador estático.
         */
    }
}
