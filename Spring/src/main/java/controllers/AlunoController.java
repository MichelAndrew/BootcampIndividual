package controllers;

import dtos.AlunoDTO;
import dtos.ResultadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {


    @Autowired
    AlunoService alunoService;

    @PostMapping("/resultado")
    public ResponseEntity<ResultadoDTO> postResultado(@RequestBody AlunoDTO alunoDTO) {
        return ResponseEntity.ok(alunoService.postResultado(alunoDTO));
    }

}