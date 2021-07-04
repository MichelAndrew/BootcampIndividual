package services;

import dtos.AlunoDTO;
import dtos.ResultadoDTO;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public ResultadoDTO postResultado(AlunoDTO alunoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.calculaBoletin(alunoDTO);
        return resultadoDTO;
    }

}
