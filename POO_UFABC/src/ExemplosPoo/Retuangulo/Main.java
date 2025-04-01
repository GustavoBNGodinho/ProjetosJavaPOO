package ExemplosPoo.Retuangulo;

public class Main {


    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(new Coordenada(10,10), 10,10);
        Retangulo retangulo1 = new Retangulo(new Coordenada(7,7),2,2);
        Coordenada ponto = new Coordenada(8,8);

        System.out.println(retangulo.contidoNoRetangulo(ponto));
        System.out.println(retangulo.retanguloContemNoRetangulo(retangulo1));
        System.out.println(retangulo);

    }
}
