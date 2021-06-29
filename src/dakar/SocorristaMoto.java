package dakar;

public class SocorristaMoto extends Socorrista<Moto> {
    @Override
    public void socorrer(Moto veiculo) {
        System.out.println("Socorrendo moto: " + veiculo.getPlaca());
    }
}
