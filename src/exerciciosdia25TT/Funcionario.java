package exerciciosdia25TT;

public class Funcionario {

    private int id;
    private String nome;
    private Cargo cargo;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getBonificacao() {
        if(cargo == Cargo.TECNICO) {
            return 5;
        }
        if(cargo == Cargo.ANALISTA) {
            return 8;
        }
        if(cargo == Cargo.GERENTE) {
            return 12.5;
        }
        return 0;
    }

    public double getParticipacaoLucro() {
        if(cargo == Cargo.DIRETOR) {
            return 3;
        }
        return 0;
    }

    public double getSalario() {
        if(cargo == Cargo.TECNICO) {
            return 3200;
        }
        if(cargo == Cargo.ANALISTA) {
            return 4000;
        }
        if(cargo == Cargo.GERENTE) {
            return 6000;
        }
        if(cargo == Cargo.DIRETOR) {
            return 15000;
        }
        return 0;
    }

    public int getHorasSemanais() {
        if(cargo == Cargo.TECNICO) {
            return 40;
        }
        if(cargo == Cargo.ANALISTA) {
            return 40;
        }
        if(cargo == Cargo.GERENTE) {
            return 36;
        }
        if(cargo == Cargo.DIRETOR) {
            return -1;
        }
        return 40;
    }

    public void pagarSalario(boolean bateuMeta) {
        double salarioBase = getSalario();
        double adicional = bateuMeta ? 0 : getCargo() == Cargo.DIRETOR ? getParticipacaoLucro() : getBonificacao();

        double salarioTotal = salarioBase + (salarioBase / 100 * adicional);

        System.out.println("Pago " + salarioTotal + " para o funcionario " + getNome());
    }
}
