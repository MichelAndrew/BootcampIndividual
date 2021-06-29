package exerciciosdia25TT;

public class Exercicio1 {

    public static void main(String[] args) {
        Funcionario michel = new FuncionarioCLT(1, "Michel Andrew da Silva", Cargo.ANALISTA, "123343425", 1);
        Funcionario cristina = new FuncionarioPJ(1, "Cristina Lucia da Silva", Cargo.DIRETOR, "11111", 1000);

        michel.pagarSalario(true);
        cristina.pagarSalario(false);
    }
}
