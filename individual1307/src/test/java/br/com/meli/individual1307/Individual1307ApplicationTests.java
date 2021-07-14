package br.com.meli.individual1307;

import br.com.meli.individual1307.controller.AlunoController;
import br.com.meli.individual1307.model.dto.AlunoDTO;
import br.com.meli.individual1307.model.dto.AlunoDisciplinaDTO;
import br.com.meli.individual1307.model.dto.DisciplinaDTO;
import br.com.meli.individual1307.model.dto.ResultadoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Individual1307ApplicationTests {

    @Autowired
    AlunoController alunoController;

    @Test
    public void testWriteDiploma() {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome("Michel Andrew");

        List<AlunoDisciplinaDTO> alunoDisciplinaDTO = new ArrayList<>();

        AlunoDisciplinaDTO alunoDisciplinaDTO1 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        disciplinaDTO.setNome("Matematica");

        alunoDisciplinaDTO1.setDisciplina(disciplinaDTO);
        alunoDisciplinaDTO1.setNota(10.0);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO1);

        AlunoDisciplinaDTO alunoDisciplinaDTO2 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO2 = new DisciplinaDTO();

        disciplinaDTO2.setNome("Portugues");

        alunoDisciplinaDTO2.setDisciplina(disciplinaDTO2);
        alunoDisciplinaDTO2.setNota(10);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO2);

        alunoDTO.setAlunoDisciplina(alunoDisciplinaDTO);

        ResponseEntity<ResultadoDTO> alunoDTOResponseEntity = alunoController.postResultado(alunoDTO);

        assertEquals(Objects.requireNonNull(alunoDTOResponseEntity.getBody()).isAprovado(), true);
    }

    @Test
    public void testWithHonors() {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome("Yan Broetto");

        List<AlunoDisciplinaDTO> alunoDisciplinaDTO = new ArrayList<>();

        AlunoDisciplinaDTO alunoDisciplinaDTO1 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        disciplinaDTO.setNome("Matematica");

        alunoDisciplinaDTO1.setDisciplina(disciplinaDTO);
        alunoDisciplinaDTO1.setNota(10.0);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO1);

        AlunoDisciplinaDTO alunoDisciplinaDTO2 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO2 = new DisciplinaDTO();

        disciplinaDTO2.setNome("Portugues");

        alunoDisciplinaDTO2.setDisciplina(disciplinaDTO2);
        alunoDisciplinaDTO2.setNota(10);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO2);

        alunoDTO.setAlunoDisciplina(alunoDisciplinaDTO);

        ResponseEntity<ResultadoDTO> alunoDTOResponseEntity = alunoController.postResultado(alunoDTO);

        assertEquals(Objects.requireNonNull(alunoDTOResponseEntity.getBody()).getDiplomaMensagem(), "Parabėns! Sua média é maior que 9.");
    }

    @Test
    public void testCalculateAverage() {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome("Michel Andrew");

        List<AlunoDisciplinaDTO> alunoDisciplinaDTO = new ArrayList<>();

        AlunoDisciplinaDTO alunoDisciplinaDTO1 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        disciplinaDTO.setNome("Matematica");

        alunoDisciplinaDTO1.setDisciplina(disciplinaDTO);
        alunoDisciplinaDTO1.setNota(10.0);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO1);

        AlunoDisciplinaDTO alunoDisciplinaDTO2 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO2 = new DisciplinaDTO();

        disciplinaDTO2.setNome("Portugues");

        alunoDisciplinaDTO2.setDisciplina(disciplinaDTO2);
        alunoDisciplinaDTO2.setNota(4.0);

        alunoDisciplinaDTO.add(alunoDisciplinaDTO2);

        alunoDTO.setAlunoDisciplina(alunoDisciplinaDTO);

        ResponseEntity<ResultadoDTO> alunoDTOResponseEntity = alunoController.postResultado(alunoDTO);

        assertEquals(Objects.requireNonNull(alunoDTOResponseEntity.getBody()).getMedia(), 7.0);
    }

    @Test
    public void testAnalyzeNotes() {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome("Michel Andrew");

        List<AlunoDisciplinaDTO> alunoDisciplinaDTO = new ArrayList<>();

        AlunoDisciplinaDTO alunoDisciplinaDTO1 = new AlunoDisciplinaDTO();

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        disciplinaDTO.setNome("Matematica");

        alunoDisciplinaDTO1.setDisciplina(disciplinaDTO);
        alunoDisciplinaDTO1.setNota(10.0);

        alunoDTO.setAlunoDisciplina(alunoDisciplinaDTO);

        ResponseEntity<ResultadoDTO> alunoDTOResponseEntity = alunoController.postResultado(alunoDTO);

        assertEquals(alunoDTOResponseEntity.getStatusCode(), HttpStatus.OK);
    }
}
