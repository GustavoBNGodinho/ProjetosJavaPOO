package ExemplosPoo.Biblioteca;

import java.util.ArrayList;

public class Acervo {
    ArrayList<Livro> acervo;

    Acervo() {
        acervo = new ArrayList<Livro>();
    }

    void adiciona(Livro livro) {
        acervo.add(livro);
    }

    void remove(String isbn) {
        for (Livro livro : acervo) {
            if (livro.isbn.equals(isbn)) {
                acervo.remove(livro);
            }
        }
    }
    ArrayList<Livro> listaEmprestados() {
        var emprestaodos = new ArrayList<Livro>();
        for (Livro livro : acervo) {
            if (livro.emprestado) {
                acervo.add(livro);
            }
        }
        return emprestaodos;
    }

    ArrayList<Livro> listaDisponiveis() {
        var disponiveis = new ArrayList<Livro>();
        for (Livro livro : acervo) {
            if (!livro.emprestado) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}
