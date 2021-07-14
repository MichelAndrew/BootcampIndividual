package br.com.meli.individual1307.controller;

import br.com.meli.individual1307.model.dto.AlunoDTO;
import br.com.meli.individual1307.model.dto.ResultadoDTO;
import br.com.meli.individual1307.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {


    @Autowired
    AlunoService alunoService;

    @PostMapping("/analyzeNotes")
    public ResponseEntity<ResultadoDTO> postResultado(@Valid @RequestBody AlunoDTO alunoDTO) {
        return ResponseEntity.ok(alunoService.postResultado(alunoDTO));
    }
}
