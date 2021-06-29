package lachiqui;

public class Convidado {

    private String nome;
    private TipoConvidado tipoConvidado;

    public Convidado(String nome, TipoConvidado tipoConvidado) {
        this.nome = nome;
        this.tipoConvidado = tipoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoConvidado getTipoConvidado() {
        return tipoConvidado;
    }

    public void setTipoConvidado(TipoConvidado tipoConvidado) {
        this.tipoConvidado = tipoConvidado;
    }
}
