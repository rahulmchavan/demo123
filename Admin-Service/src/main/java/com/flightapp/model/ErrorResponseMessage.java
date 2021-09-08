package com.flightapp.model;

import java.time.LocalDateTime;

public class ErrorResponseMessage {
	
	private int stausCode;
	private String message;
	private Exception e;
	private LocalDateTime time;
	public int getStausCode() {
		return stausCode;
	}
	public void setStausCode(int stausCode) {
		this.stausCode = stausCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Exception getE() {
		return e;
	}
	public void setE(Exception e) {
		this.e = e;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ErrorResponseMessage [stausCode=" + stausCode + ", message=" + message + ", e=" + e + ", time=" + time
				+ "]";
	}
	public ErrorResponseMessage(int stausCode, String message, Exception e) {
		this();
		this.stausCode = stausCode;
		this.message = message;
		this.e = e;
	 
	}
	public ErrorResponseMessage() {
		this.time = LocalDateTime.now();
	}
	
	

}
