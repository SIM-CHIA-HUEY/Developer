package fr.formation.developers.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestControllerAdvice
// Dans le controller, on déclare les endpoints
public class CustomControllerAdvise extends ResponseEntityExceptionHandler {
//extends + @override : on va redefinir cette methode 'handleMethod...' qui était par défaut
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid
            (MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        List<ObjectError> errors = ex.getAllErrors();
        return handleExceptionInternal(ex,errors,headers,badRequest,request);
    }
}

