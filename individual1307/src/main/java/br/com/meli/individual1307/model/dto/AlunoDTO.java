package br.com.meli.individual1307.model.dto;

import br.com.meli.individual1307.model.Aluno;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {

    @NotNull
    @Size(min = 8, max = 50)
    @Pattern(regexp = "ˆ[A-Za-x]*$", message = "Nome pode ter apenas letras")
    private String nome;

    @NotNull
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
