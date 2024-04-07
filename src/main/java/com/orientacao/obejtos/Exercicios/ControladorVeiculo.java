package com.orientacao.obejtos.Exercicios;

import java.util.Scanner;

public class ControladorVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Cadastro de Veiculos =======");

        System.out.println("Marca");
        String marca = scanner.nextLine();

        System.out.println("Modelo");
        String modelo = scanner.nextLine();

        System.out.println("Ano");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.println("Cor");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(marca, modelo, ano, cor);
        System.out.println("\n Detalhes do Veiculo");
        veiculo.exibirDetalhes();
    }

}
