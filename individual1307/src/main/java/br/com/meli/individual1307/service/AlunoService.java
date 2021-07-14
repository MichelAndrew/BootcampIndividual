package br.com.meli.individual1307.service;

import br.com.meli.individual1307.model.dto.AlunoDTO;
import br.com.meli.individual1307.model.dto.ResultadoDTO;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public ResultadoDTO postResultado(AlunoDTO alunoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.calculaBoletin(alunoDTO);
        return resultadoDTO;
    }

}
