package exerciciosdia25;

public class Exercicio2 {

/*
    Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
    A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia e os setters e getters
    correspondentes (métodos de acesso).
*/

    public static void main(String[] args) {

        Counter counter = new Counter();

        for (int i = 0; i < 10; i++) {
            counter.add();
            System.out.println("Contei até " + counter.getAtual());
        }
    }
}
