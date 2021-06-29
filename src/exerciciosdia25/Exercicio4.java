package exerciciosdia25;

public class Exercicio4 {

    /*
        Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações.
        Todos os métodos devem ser sobrecarregados para que também possam ser usados ​​para operar entre frações
        e números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
    */
    public static void main(String[] args) {
        System.out.println(Fracao.dividir(10, 3));
        System.out.println(Fracao.dividir(10.0, 3));
    }
}
