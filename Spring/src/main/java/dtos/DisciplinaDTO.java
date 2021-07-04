package dtos;

import models.Disciplina;

public class DisciplinaDTO {

    private String nome;

    public DisciplinaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina converteParaModel() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(getNome());
        return disciplina;
    }
}
