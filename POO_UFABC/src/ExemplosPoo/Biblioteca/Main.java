package ExemplosPoo.Biblioteca;

public class Main {
    public static void main(String[] args) {

        Acervo acervo = new Acervo();

        Livro livro1 = new Livro(
                "Gustavo book",
                "Gustavinho bonitinho",
                2010,
                "934-93-23365-73-1");

        Livro livro2 = new Livro(
                "O senhor dos aneis",
                "J.R.R Tolkein",
                1869,
                "452-71-48219-72-9");
        Livro livro3 = new Livro(
                "Cem Anos de Solidão",
                "Gabriel Garcia Marquez",
                1967,
                "961-65-84268-22-5");

        acervo.adiciona(livro1);
        acervo.adiciona(livro2);
        acervo.adiciona(livro3);

        livro3.empresta();

        System.out.println(livro3.isEmprestado());
        System.out.println(livro2);


    }
}

