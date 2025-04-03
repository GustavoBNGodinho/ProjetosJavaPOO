package javacore.introduaoClasses.teste;

import javacore.introduaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corsa";
        carro1.modelo = "Super";
        carro1.ano = 2000;

        carro2.nome = "HB20";
        carro2.modelo = "Ultra";
        carro2.ano = 2015;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("-----------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
