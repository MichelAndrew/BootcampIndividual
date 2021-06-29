package dakar;

public abstract class Veiculo implements Comparable<Veiculo> {
    private double velocidade;
    private double aceleracao;
    private double anguloDeGiro;
    private double peso;
    private int rodas;
    private String placa;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, double peso, int rodas, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.peso = peso;
        this.rodas = rodas;
        this.placa = placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getFatorMaximo() {
        return velocidade * aceleracao / (anguloDeGiro * (peso - rodas * 100));
    }

    @Override
    public int compareTo(Veiculo o) {
        return Double.compare(o.getFatorMaximo(), getFatorMaximo());
    }
}
