package com.orientacao.obejtos.heranca;

public class PrincipalPessoa {
    public static void main(String[] args) {

        // Objetos de subclasses
        Aluno aluno = new Aluno("Renato", 343434);
        Professor professor = new Professor("Claudia", "Mobile");

        // Chamando os Métodos
        aluno.detalhesPessoa();
        aluno.detalhesAluno();

        professor.detalhesPessoa();
        professor.detalhesProfessor();

    }
}
