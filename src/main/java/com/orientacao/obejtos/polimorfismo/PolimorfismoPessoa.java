package com.orientacao.obejtos.polimorfismo;

public class PolimorfismoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 =  new ContaCorrente("Rafael", 3535);
        Pessoa pessoa2 =  new ContaPoupanca("Julina", "cod_CP 9089");

        pessoa1.status();
        pessoa2.status();
    }


}
