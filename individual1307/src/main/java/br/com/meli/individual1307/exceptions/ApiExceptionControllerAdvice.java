package br.com.meli.individual1307.exceptions;

import br.com.meli.individual1307.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorDTO> handlerMethodArgumentNotValid(MethodArgumentNotValidException exception) {
        ErrorDTO error = new ErrorDTO();
        error.setName("Erro de validação.");
        List<String> listFields = exception.getFieldErrors().stream().map(FieldError::getField).collect(Collectors.toList());
        error.setErrorDetail("Campos invalidos: " + listFields.toString());
        error.setHtttpStatusCode(400);
        return new ResponseEntity<ErrorDTO>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<ErrorDTO> handlerHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        ErrorDTO error = new ErrorDTO();
        error.setName("Http message não pode ser lida.");
        error.setErrorDetail("Corpo da requisição invalido");
        error.setHtttpStatusCode(400);
        return new ResponseEntity<ErrorDTO>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({MethodArgumentTypeMismatchException.class})
    public ResponseEntity<ErrorDTO> handlerMethodArgumentTypeMismatchException (MethodArgumentTypeMismatchException exception) {
        ErrorDTO error = new ErrorDTO();
        error.setName("Tipo de parametro invalido.");
        error.setErrorDetail(exception.getMessage());
        error.setHtttpStatusCode(400);
        return new ResponseEntity<ErrorDTO>(error, HttpStatus.BAD_REQUEST);
    }
}
