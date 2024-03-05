package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println("Dentro do construtor:");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime() {
        /*
        Da mesma forma que fazemos sobrecarga de método, podemos fazer
        sobrecarga de construtores. Neste exemplo, temos dois construtores
        Anime, um recebendo parâmetros obrigatoriamente e outro não.
         */
    }

    /*
    1a regra: construtor não tem retorno.
    obs: mesmo se não descrevermos um construtor na classe base, o java
    adiciona automaticamente na compilação. Vc PRECISA de um construtor
    para dar origem a um objeto.
    Construtores tem a vantagem de te forçar a seguir algumas regrinhas,
    passando parâmetros diretamente no construtor.
    O construtor é sempre inicializado antes dos métodos.
    CUIDADO: construtur não tem retorno. Se tiver retorno (como void),
    é método.
    2a regra: se eu por acaso precisar chamar um construtor dentro do
    outro, deve ser obrigatoriamente a primeira linha do código, ex:
    public Anime(String nome, String tipo, int episodios, String genero,
    String estudio) {
    this.(nome, tipo, episodios, genero);
    this.estudio = estudio;
    }
    No exemplo acima, um novo construtor foi adicionado para contemplar
    o novo atributo (estudio), sem necessariamente ter que alterar o
    construtor original e assim quebrar outras partes do código.
    Assim, quando novos objetos forem criados com esse atributo
    estúdio, chama-se esse novo construtor, que referencia o antigo,
    mas com a adição do atributo novo.
     */

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
