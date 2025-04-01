package biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(
                "O senhor dos aneis",
                "J.R.R Tolkein",
                1869,
                "123");
        Livro livro2 = new Livro(
                "Cem Anos de Solidão",
                "Gabriel Garcia Marquez",
                1967,
                "961");

    }
}
