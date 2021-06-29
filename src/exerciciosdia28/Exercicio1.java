package exerciciosdia28;

import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        testPessoa();
        testCelular();
    }

    private static void testPessoa() {
        Precedente<Pessoa> precedente = new Pessoa("Michel", "41855753818");
        Precedente<Pessoa> precedente2 = new Pessoa("Andrew", "4126788810");
        Precedente<Pessoa> precedente3 = new Pessoa("Silva", "50855278918");

        Precedente<Pessoa>[] precedentes = new Precedente[]{precedente, precedente2, precedente3};
        System.out.println(Arrays.toString(SortUtil.sort(precedentes)));
    }

    private static void testCelular() {
        Precedente<Celular> precedente = new Celular("953604155", "Michel");
        Precedente<Celular> precedente2 = new Celular("953604157", "Andrew");
        Precedente<Celular> precedente3 = new Celular("953604156", "Silva");

        Precedente<Celular>[] precedentes = new Precedente[]{precedente, precedente2, precedente3};
        System.out.println(Arrays.toString(SortUtil.sort(precedentes)));
    }
}
