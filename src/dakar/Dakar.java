package dakar;

public class Dakar {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(100, 10000, 2, "Corrida 1");

        corrida.registrarCarro(10, 10, 50, "TMA5134");
        corrida.registrarMoto(8, 13, 60, "GGI9321");

        corrida.socorrerCarro("TMA5134");
        System.out.println("O vencedor foi " + corrida.obterVencedor().getPlaca() + "!");
    }

}
