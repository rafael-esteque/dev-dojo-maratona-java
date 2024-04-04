package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

/*
Quando Java foi criado, as Interfaces surgiram como contratos, pois classes
abstratas são contratos. Apenas a partir do Java 8 passamos a poder criar
métodos concretos dentro de uma interface, mas até o 7 todos os métodos em
uma interface eram abstratos.
 */
public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    /*
    Nem precisaria escrever public static final, pois todos os atributos de uma
    interface já são por padrão.
    */
    void load();
    /*
    Nem precisaria escrever public e abstract, pois todos os métodos de uma
    interface já são por padrão.
     */

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
        /*
        O default foi adicionado no Java 8 para permitir métodos em interfaces
        que não precisem ser implementados especificamente em todoas
        as filhas.
         */
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMazDataSize na interface");
    }
}
