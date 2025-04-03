package javacore.introduaoClasses.teste;

import javacore.introduaoClasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.idade = 37;
        professor.nome = "Mestre Kami";
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + "\nidade: " + professor.idade + "\nsexo: " + professor.sexo);
    }
}
