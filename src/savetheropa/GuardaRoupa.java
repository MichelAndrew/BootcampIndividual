package savetheropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> roupas;
    private int identificador;

    public GuardaRoupa(int identificador) {
        this.roupas = new HashMap<>();
        this.identificador = identificador;
    }

    public Map<Integer, List<Vestuario>> getRoupas() {
        return roupas;
    }

    public void setRoupas(Map<Integer, List<Vestuario>> roupas) {
        this.roupas = roupas;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        int vestuarioId = roupas.size() + 1;
        roupas.put(vestuarioId, listaDeVestuario);

        return vestuarioId;
    }

    public void mostrarVestuarios() {
        roupas.forEach((a, b) -> {
            System.out.println("Roupas do Identificador " + a + ":");
            b.forEach((e) -> System.out.println(e.getModelo() + " - " + e.getMarca()));
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        if(roupas.containsKey(id)) {
            return roupas.get(id);
        }
        return null;
    }
}
