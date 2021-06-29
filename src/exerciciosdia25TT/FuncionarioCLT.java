package exerciciosdia25TT;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(int id, String nome, Cargo cargo, String cpf, double salarioMes) {
        super(id, nome, cargo);
        this.cpf = cpf;
        this.salarioMes = salarioMes;
    }

    private String cpf;
    private double salarioMes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }
}
