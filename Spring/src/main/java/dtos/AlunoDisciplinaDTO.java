package dtos;

import models.AlunoDisciplina;

public class AlunoDisciplinaDTO {

    private DisciplinaDTO disciplina;
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
