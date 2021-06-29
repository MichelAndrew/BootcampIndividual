package savetheropa;

import java.util.Arrays;
import java.util.List;

public class SaveTheRopa {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa(1);

        List<Vestuario> roupas = Arrays.asList(
                new Vestuario("Ripcurl", "Moletom"),
                new Vestuario("C&A", "Camisa"),
                new Vestuario("Quiksilver", "Bermuda"),
                new Vestuario("TNG", "Social"));

        int vestuariosId = guardaRoupa.guardarVestuarios(roupas);

        guardaRoupa.mostrarVestuarios();

        guardaRoupa.devolverVestuarios(vestuariosId);
        System.out.println("Roupas removidas!");
    }
}
