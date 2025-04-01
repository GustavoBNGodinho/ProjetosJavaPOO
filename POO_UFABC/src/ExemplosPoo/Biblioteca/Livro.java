package ExemplosPoo.Biblioteca;

public class Livro {
    String titulo;
    String autor;
    int ano;
    String isbn; //000-00-00000-00-0
    boolean emprestado;

    Livro(String titulo, String autor, int ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        emprestado = false;
    }

    void empresta() {
        if (emprestado) {
            throw new IllegalStateException("O livro já está emprestado");
        } else {
            emprestado = true;
        }
    }

    void devolver() {
        if (!emprestado) {
            throw new IllegalStateException("O livro não está emprestado");
        } else {
            emprestado = false;
        }
    }

    boolean isEmprestado() {
        if (emprestado) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Título: " + this.titulo + "\n"
                + "Autor: " + this.autor + "\n"
                + "ano de publicação:       " + this.ano + "\n"
                + "ISBN: " + this.isbn + "\n";
    }
}
