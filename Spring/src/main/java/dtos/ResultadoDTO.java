package dtos;

public class ResultadoDTO {

    private boolean aprovado;
    private double media;
    private String diplomaMensagem;

    public ResultadoDTO() {
    }

    public void calculaBoletin(AlunoDTO alunoDTO) {
        media = alunoDTO.getAlunoDisciplina().stream().mapToDouble(e -> e.getNota()).sum() / alunoDTO.getAlunoDisciplina().size();
        aprovado = media >= 7;
        if(media >= 9) {
            diplomaMensagem = "Parabėns! Sua média é maior que 9.";
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getDiplomaMensagem() {
        return diplomaMensagem;
    }

    public void setDiplomaMensagem(String diplomaMensagem) {
        this.diplomaMensagem = diplomaMensagem;
    }
}