package Herança;

public class Aluno {
    protected String nome;
    protected String  ra;
    protected  int anoNascimento;

    @Override
    public String toString() {
        return String.format("Nome : %s\n", nome);
    }
}
