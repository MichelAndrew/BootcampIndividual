package exerciciosdia25TT;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(int id, String nome, Cargo cargo, String cnpj, double salarioHora) {
        super(id, nome, cargo);
        this.cnpj = cnpj;
        this.salarioHora = salarioHora;
    }

    private String cnpj;
    private double salarioHora;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
}
