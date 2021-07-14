package br.com.meli.individual1307.model.dto;

import br.com.meli.individual1307.model.Disciplina;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DisciplinaDTO {

    @NotNull
    @Size(min = 8, max = 50)
    @Pattern(regexp = "ˆ[A-Za-x]*$", message = "Nome pode ter apenas letras")
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
