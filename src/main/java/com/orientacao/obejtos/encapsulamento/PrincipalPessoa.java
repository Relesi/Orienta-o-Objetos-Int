package com.orientacao.obejtos.encapsulamento;

public class PrincipalPessoa {
    public static void main(String[] args) {
        // Criando obejeto da classe Pessoa
        Pessoa pessoa = new Pessoa("John", 34);

        // Chamando o método para exibir detalhes
        pessoa.detalhes();

        // Modificando nome e idade usando set
        pessoa.setNome("Jimy");
        pessoa.setIdade(40);

        // Chamando o método para exibir detalhes após a modificação
        pessoa.detalhes();

    }
}
