package ModificadoresDeAcesso;

class Estudante {
    String nome;
    int idade;
    float[] notas;

    Estudante(String nome, int idade, float[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    double calcularMedia() {
        double media = 0.0;

        for (float nota : notas) {
            media += nota;
        }
        return media;
    }
}
