package com.flightapp.exception;

public class ScheduleNotFoundException extends Exception {
	
	public ScheduleNotFoundException() {
		super();
	}
	
	public ScheduleNotFoundException(String s) {
		super(s);
	}

	public ScheduleNotFoundException(Exception e) {
		super(e);
	}
	
}
