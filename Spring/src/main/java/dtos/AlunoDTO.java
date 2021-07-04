package dtos;

import models.Aluno;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {

    private String nome;
    private List<AlunoDisciplinaDTO> alunoDisciplina;

    public AlunoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AlunoDisciplinaDTO> getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(List<AlunoDisciplinaDTO> alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public Aluno converteParaModel() {
        Aluno aluno = new Aluno();
        aluno.setNome(getNome());
        aluno.setAlunoDisciplina(alunoDisciplina.stream().map(AlunoDisciplinaDTO::converteParaModel).collect(Collectors.toList()));
        return aluno;
    }
}
