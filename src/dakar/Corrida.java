package dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private int quantidadeVeiculosPermitidos;
    private String nome;
    private List<Veiculo> listaVeiculos;

    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premioEmDolares, int quantidadeVeiculosPermitidos, String nome) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.nome = nome;
        this.listaVeiculos = new ArrayList<>();
        socorristaCarro = new SocorristaCarro();
        socorristaMoto = new SocorristaMoto();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if(getListaVeiculos().size() == getQuantidadeVeiculosPermitidos()) {
            return;
        }
        listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente));
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if(getListaVeiculos().size() == getQuantidadeVeiculosPermitidos()) {
            return;
        }
        listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        Optional<Veiculo> veiculo = listaVeiculos.stream().filter((e) -> e.getPlaca().equals(placa)).findFirst();
        veiculo.ifPresent((e) -> listaVeiculos.remove(e));
    }

    public Veiculo obterVencedor() {
        listaVeiculos.sort(null);
        return listaVeiculos.get(0);
    }

    public void socorrerCarro(String placa) {
        Veiculo veiculo = listaVeiculos.stream().filter((e) -> e.getPlaca().equals(placa)).findFirst().get();
        if(veiculo instanceof Carro) {
            socorristaCarro.socorrer((Carro) veiculo);
        } else {
            System.out.println("O veículo de placa " + placa + " não é um carro.");
        }
    }

    public void socorrerMoto(String placa) {
        Veiculo veiculo = listaVeiculos.stream().filter((e) -> e.getPlaca().equals(placa)).findFirst().get();
        if(veiculo instanceof Moto) {
            socorristaMoto.socorrer((Moto) veiculo);
        } else {
            System.out.println("O veículo de placa " + placa + " não é uma moto.");
        }
    }
}
