package academy.devdojo.maratonajava.javacore.Aintroducalclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducalclasses.dominio.Carro;

import java.sql.SQLOutput;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        //carro1 = carro2;
        /*
        com essa atribuição, a referência ao objeto de memória que era o carro1
        fica perdida. Ambos vão ser Mustang.
         */

        /*
        Professor professor = new professor();
        carro1 = professor;
        Aqui daria erro, pois os objetos são completamente diferentes.
         */

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
