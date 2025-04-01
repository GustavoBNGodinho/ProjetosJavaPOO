package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionaLLivro(Livro livro) {
        acervo.add(livro);
    }

    void removeLivroIsbn(String isbn) {
        for (Livro livro : acervo) {
            if (isbn.equals(livro.isbn)) {
                acervo.remove(livro);
            }
        }
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<Livro>();

        for (Livro livro : acervo) {
            if (livro.emprestado) {
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis(Livro livro) {
        var disponiveis = new ArrayList<Livro>();

        if (!livro.isEmprestado()) {
            disponiveis.add(livro);
        }
        return disponiveis;
    }
}
