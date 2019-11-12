package de.gothaer.firstmove;

import de.gothaer.firstmove.FirstMove.FirstMoveNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice
{
    @ExceptionHandler(FirstMoveNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String catNotFoundException (FirstMoveNotFoundException e){
        return e.getMessage();
    }
}
