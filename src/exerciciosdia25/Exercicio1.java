package exerciciosdia25;

import java.math.BigDecimal;

public class Exercicio1 {

/*
     Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência. A classe conterá um construtor padrão,
    um com parâmetros e outro que receberá uma conta corrente da qual copiará todos os seus dados. Além disso, os métodos de acesso devem
    ser desenvolvidos para cada variável de instância da classe, desenvolvendo um método set e outro método get. Por exemplo: se a classe tem
    uma variável double saldo, seus métodos de acesso serão: double getSaldo () e void setSaldo (double s)
    Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.
*/

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("1234", "3", new BigDecimal(0));
        contaCorrente.deposito(new BigDecimal(50));
        System.out.println("Saldo: " + contaCorrente.getSaldo().doubleValue());
    }
}
