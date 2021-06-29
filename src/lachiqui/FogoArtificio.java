package lachiqui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FogoArtificio {

    private TipoFogoArtificio tipoFogoArtificio;
    private List<FogoArtificio> fogosArtificio;

    public FogoArtificio(TipoFogoArtificio tipoFogoArtificio) {
        this.tipoFogoArtificio = tipoFogoArtificio;
        fogosArtificio = new ArrayList<>();
    }

    public TipoFogoArtificio getTipoFogoArtificio() {
        return tipoFogoArtificio;
    }

    public void setTipoFogoArtificio(TipoFogoArtificio tipoFogoArtificio) {
        this.tipoFogoArtificio = tipoFogoArtificio;
    }

    public List<FogoArtificio> getFogosArtificio() {
        return fogosArtificio;
    }

    public void setFogosArtificio(List<FogoArtificio> fogosArtificio) {
        this.fogosArtificio = fogosArtificio;
    }

    public void explodir() {
        Random random = new Random();
        int o = random.nextInt(10) + 1;
        StringBuilder stringBuilder = new StringBuilder("Bo");
        for(int i = 0; i < o; i++) {
            stringBuilder.append("o");
        }
        stringBuilder.append("m!");
        System.out.println(stringBuilder.toString());
    }
}
