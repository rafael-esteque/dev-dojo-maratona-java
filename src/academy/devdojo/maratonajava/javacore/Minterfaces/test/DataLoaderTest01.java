package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}

/*
Aula 89 (última de interface)
Praticamente todos os framworks e projetos de alguma forma vão utilizar interface.
A partir do momento que você aprende a usar interface, existe um conceito
de desenvolver programação orientada a interfaces, pois você estatá desacoplando
seu código e fazendo um auto uso do polimorfismo, melhorando a qualidade e
a facilidade de manutenção.
 */