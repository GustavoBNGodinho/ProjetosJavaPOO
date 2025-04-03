package javacore.introduaoClasses.teste;

import javacore.introduaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Gustavo";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
