package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

/*
modificadores de acesso do + restritivo p o + liberal:
private -> default -> protected -> public
Se colocamos um modificador restritivo numa classe abstrata,
só poderemos sobrescrever com um menos restritivo.
*/

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMazDataSize na classe DatabaseLoader");
    }
}
