package models;

import dtos.DisciplinaDTO;

public class Disciplina {

    private String nome;

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DisciplinaDTO converterParaDTO() {
        DisciplinaDTO dto = new DisciplinaDTO();
        dto.setNome(getNome());
        return dto;
    }
}