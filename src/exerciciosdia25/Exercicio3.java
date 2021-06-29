package exerciciosdia25;

public class Exercicio3 {

/*    Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser: public String toString ().
    Este método deve retornar uma string que representa o objeto. Por exemplo: se a classe tiver os atributos: título, isbn e autor,
    uma string representando um livro poderia ser: "Harry Potter, 9780545582889, Rowling, J. K.". A classe conterá um construtor padrão,
    um construtor com parâmetros e os métodos de acesso.
    Adicione a linha @Override logo acima do cabeçalho do método toString. Em seguida, renomeie o método para:
    tostring (tudo em letras minúsculas). O que acontece?
 */

    public static void main(String[] args) {
        Book book = new Book(1, "J. K Rowling", "Harry Potter", 2000);

        System.out.println(book.toString());
    }

}
