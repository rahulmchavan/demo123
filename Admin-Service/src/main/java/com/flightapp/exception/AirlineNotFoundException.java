package com.flightapp.exception;

public class AirlineNotFoundException extends Exception  {

	public AirlineNotFoundException() {
		super();
	}
	
	public AirlineNotFoundException(String s) {
		super(s);
	}
}
