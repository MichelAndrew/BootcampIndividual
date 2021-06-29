package exerciciosdia25;

public class Exercicio5 {

    /*
        Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e
        o método toString, conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro
        para adicionar um dia ao valor atual da data. A classe GregorianCalendar deve ser investigada e usada para implementar
        os construtores e métodos Date.
    */
    public static void main(String[] args) {
        Data data = new Data(21, 8, 2021);
        data.adicionarDia(10);
        System.out.println(data);
    }
}
