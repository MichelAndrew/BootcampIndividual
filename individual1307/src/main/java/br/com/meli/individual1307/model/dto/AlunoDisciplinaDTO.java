package br.com.meli.individual1307.model.dto;

import br.com.meli.individual1307.model.AlunoDisciplina;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class AlunoDisciplinaDTO {

    @NotNull
    @Valid
    private DisciplinaDTO disciplina;

    @NotNull
    private double nota;

    public AlunoDisciplinaDTO() {
    }

    public DisciplinaDTO getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaDTO disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public AlunoDisciplina converteParaModel() {
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
        alunoDisciplina.setDisciplina(getDisciplina().converteParaModel());
        alunoDisciplina.setNota(getNota());

        return alunoDisciplina;
    }
}
