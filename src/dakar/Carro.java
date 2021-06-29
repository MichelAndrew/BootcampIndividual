package dakar;

public class Carro extends Veiculo {

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, 1000, 4, placa);
    }
}
