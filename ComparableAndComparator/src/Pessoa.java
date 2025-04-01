public class Pessoa implements Comparable<Pessoa> {
    int idade;
    String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.idade - pessoa.idade;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)",nome, idade);
    }
}


