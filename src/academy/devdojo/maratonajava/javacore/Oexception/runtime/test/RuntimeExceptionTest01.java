package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    // Termos para lembrar: Checked e Unchecked
    /*
    Checked: são filhas de Exception diretamente, e se não tratadas
    vão lançar um erro em tempo de compilação, ou seja, você nem
    consegue compilar seu código, a não ser que faça uma
    tratativa de erro. Sem tratamento o código nem compila.
    Unchecked: são filhas de RuntimeException, que é filha de
    Exception. Quando lançadas pelo programa, quase 100% das
    vezes o problema é o desenvolvedor, que não fez uma
    tratativa de erro, ou fez um cast que não pode, etc.
    A CLASSE RuntimeException tem muitas filhas, algumas
    vamos acabar decorando ao longo do trabalho.
     */
    Object object = null;
}
