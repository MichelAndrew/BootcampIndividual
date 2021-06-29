package exerciciosdia28;

public class SortUtil {

    public static <T extends Precedente> Precedente<T>[] sort(Precedente<T>[] arr) {
        Precedente<T> aux = null;
        int i = 0;

        for(i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length - 1; j++){
                if(arr[j].precedeA((T) arr[j + 1]) > 0){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        return arr;
    }

    public static <T extends Precedente> Precedente<T>[] heapSort(Precedente<T>[] arr) {
        int tamanho = arr.length;
        int i = tamanho / 2, pai, filho;
        Object t;
        while (true){
            if (i > 0){
                i--;
                t = arr[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return arr;}
                t = arr[tamanho];
                arr[tamanho] = arr[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (arr[filho + 1].precedeA((T) arr[filho]) < 0)) {filho++;}
                if (arr[filho].precedeA((T) t) > 0){
                    arr[pai] = arr[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            arr[pai] = (Precedente<T>) t;
        }
    }
}
