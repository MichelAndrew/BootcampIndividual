package models;

import dtos.AlunoDTO;

import java.util.List;
import java.util.stream.Collectors;

public class Aluno {

    private String nome;
    private List<AlunoDisciplina> alunoDisciplina;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AlunoDisciplina> getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(List<AlunoDisciplina> alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public AlunoDTO converterParaDTO() {
        AlunoDTO dto = new AlunoDTO();
        dto.setNome(getNome());
        dto.setAlunoDisciplina(alunoDisciplina.stream().map(AlunoDisciplina::converteParaDTO).collect(Collectors.toList()));

        return dto;
    }
}
