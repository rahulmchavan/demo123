package com.flightapp.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flightapp.exception.AirlineNotAddedException;
import com.flightapp.exception.AirlineNotFoundException;
import com.flightapp.exception.ScheduleNotFoundException;
import com.flightapp.model.ErrorResponseMessage;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(AirlineNotAddedException.class)
	public ResponseEntity<ErrorResponseMessage> handleAirlineNotAddedException(Exception e){
		return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseMessage(500, "Airline not added...!", e));
	}

	@ExceptionHandler(AirlineNotFoundException.class)
	public ResponseEntity<ErrorResponseMessage> handleAirlineNotFoundException(Exception e){
		return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseMessage(500, "Airline Not Found...!", e));
	}
	
	
	@ExceptionHandler(ScheduleNotFoundException.class)
	public ResponseEntity<ErrorResponseMessage> handleScheduleNotFoundException(Exception e){
		return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseMessage(500, "Airline Not Scheduled.!", e));
	}
	
}
