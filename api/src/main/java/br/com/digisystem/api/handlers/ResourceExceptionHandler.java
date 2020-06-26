package br.com.digisystem.api.handlers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.digisystem.api.services.exceptions.ObjectNotFoundDigiException;

@RestControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler ( ObjectNotFoundDigiException.class )
	public ResponseEntity <StandardError> objectNotFound( ObjectNotFoundDigiException ex, HttpServletRequest http ) {
		
		StandardError se = StandardError
				.builder()
				.mensagem( ex.getMessage() )
				.status( HttpStatus.NOT_FOUND.value() )
				.timestamp( new Date() )
				.build();
		
		return ResponseEntity.status( HttpStatus.NOT_FOUND.value() ).body( se );
	}
	
	
}
