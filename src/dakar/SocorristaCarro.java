package dakar;

public class SocorristaCarro extends Socorrista<Carro>{
    @Override
    public void socorrer(Carro veiculo) {
        System.out.println("Socorrendo carro: " + veiculo.getPlaca());
    }
}

