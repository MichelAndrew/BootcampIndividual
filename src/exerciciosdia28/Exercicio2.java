package exerciciosdia28;

import java.util.Arrays;

public class Exercicio2 {

    /**
     * Visto que o HeapSort foi mais performatico no exercicio de Generics,
     * ele foi implementado no Precedente
     */

    public static void main(String[] args) {
        testPessoaWithHeapSort();
    }

    private static void testPessoaWithHeapSort() {
        Precedente<Pessoa> precedente = new Pessoa("Michel", "41855753818");
        Precedente<Pessoa> precedente2 = new Pessoa("Andrew", "4126788810");
        Precedente<Pessoa> precedente3 = new Pessoa("Silva", "50855278918");

        Precedente<Pessoa>[] precedentes = new Precedente[]{precedente, precedente2, precedente3};
        System.out.println(Arrays.toString(SortUtil.heapSort(precedentes)));
    }
}
