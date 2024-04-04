package academy.devdojo.maratonajava.javacore.Kenum.dominio;

import javax.print.DocFlavor;

/*
Aula 80 - Nessa aula vamos falar de um tipo especial de classes que é a enumeração.
Antes de chegar no ápice de Orientação a Objetos, que é o polimorfismo,
precisamos entender alguns conceitos como enumerações, classes abstratas
e interfaces.
  */
public class Cliente {

    //exemplo de enum dentro da própria classe (pré aula 82):
//    public enum TipoPagamento {
//        DEBITO, CREDITO
//    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
    /*
    Parte da aula 80, que apagamos no começo da 81:

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    */

    /*
    Fazendo na mão sem o enum:

    private String tipo;

    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

     public Cliente(String nome, String tipo) {
         if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
             return;
         }
         this.nome = nome;
         this.tipo = tipo;
     }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getTipo() {
         return tipo;
     }

     public void setTipo(String tipo) {
         this.tipo = tipo;
     }
     */
 }
