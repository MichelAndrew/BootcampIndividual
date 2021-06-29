package lachiqui;

import java.util.ArrayList;
import java.util.List;

public class LaChiqui {

    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();

        convidados.add(new Convidado("Michel", TipoConvidado.MELI));
        convidados.add(new Convidado("Cristina", TipoConvidado.STANDARD));
        convidados.add(new Convidado("Tatiane", TipoConvidado.STANDARD));

        List<FogoArtificio> fogosArtificio = new ArrayList<>();

        FogoArtificio fogoArtificio1 = new FogoArtificio(TipoFogoArtificio.INDIVIDUAL);

        fogoArtificio1.getFogosArtificio().add(new FogoArtificio(TipoFogoArtificio.INDIVIDUAL));

        FogoArtificio fogoArtificio2 = new FogoArtificio(TipoFogoArtificio.PACOTE);

        for(int i = 0; i < 10; i++) {
            fogoArtificio2.getFogosArtificio().add(new FogoArtificio(TipoFogoArtificio.INDIVIDUAL));
        }

        fogosArtificio.add(fogoArtificio1);
        fogosArtificio.add(fogoArtificio2);

        System.out.println("Fogos de artifício totais: " + getTotalFogosArtificio(fogosArtificio));

        fogosArtificio.forEach((e) -> e.getFogosArtificio().forEach(FogoArtificio::explodir));

        System.out.println("");
        convidados.forEach((e) -> {
            if(e.getTipoConvidado() == TipoConvidado.MELI) {
                System.out.println(e.getNome() + ": Viva la Chiqui!!");
            }
        });
    }

    private static int getTotalFogosArtificio(List<FogoArtificio> fogosArtificios) {
        return fogosArtificios.stream().mapToInt(e -> e.getFogosArtificio().size()).sum();
    }

}
