package com.epam.forecast.ai.sunTracker.exception;

import dev.langchain4j.service.output.OutputParsingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OutputParsingException.class)
    public ResponseEntity<String> handleOutputParsingException(OutputParsingException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Error while parsing output: " + ex.getMessage());
    }

}
