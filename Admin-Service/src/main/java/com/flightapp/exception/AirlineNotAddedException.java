package com.flightapp.exception;

public class AirlineNotAddedException extends Exception {
	
	public AirlineNotAddedException() {
		super();
	}
	
	public AirlineNotAddedException(String s) {
		super(s);
	}
	
 
	public AirlineNotAddedException(Exception e) {
		super(e);
	}
	 

}
