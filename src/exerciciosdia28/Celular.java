package exerciciosdia28;

public class Celular implements Precedente<Celular> {

    private String numero;
    private String holder;

    public Celular(String numero, String holder) {
        this.numero = numero;
        this.holder = holder;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "{" +
                "numero='" + numero + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public int precedeA(Celular celular) {
        return getNumero().compareTo(celular.getNumero());
    }
}
