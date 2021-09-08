
package com.flightapp.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedules {
	 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int	scheduleid;
   
private String flightNumber;

private String fromPlace ;

private String toPlace;

private Date startTime;

private Date endTime;

private String instruments;

private int totalBusinessSeats;

private int totalNonBusinessSeats;

private double ticketCost;
  

public int getScheduleid() {
	return scheduleid;
}

public void setScheduleid(int scheduleid) {
	this.scheduleid = scheduleid;
}

public String getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}

public String getFromPlace() {
	return fromPlace;
}

public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}

public String getToPlace() {
	return toPlace;
}

public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}

public Date getStartTime() {
	return startTime;
}

public void setStartTime(Date startTime) {
	this.startTime = startTime;
}

public Date getEndTime() {
	return endTime;
}

public void setEndTime(Date endTime) {
	this.endTime = endTime;
}

public String getInstruments() {
	return instruments;
}

public void setInstruments(String instruments) {
	this.instruments = instruments;
}

public int getTotalBusinessSeats() {
	return totalBusinessSeats;
}

public void setTotalBusinessSeats(int totalBusinessSeats) {
	this.totalBusinessSeats = totalBusinessSeats;
}

public int getTotalNonBusinessSeats() {
	return totalNonBusinessSeats;
}

public void setTotalNonBusinessSeats(int totalNonBusinessSeats) {
	this.totalNonBusinessSeats = totalNonBusinessSeats;
}

public double getTicketCost() {
	return ticketCost;
}

public void setTicketCost(double ticketCost) {
	this.ticketCost = ticketCost;
}
//public int airlineId;

public Schedules(int scheduleid, String flightNumber, String fromPlace, String toPlace, Date startTime, Date endTime,
		String instruments, int totalBusinessSeats, int totalNonBusinessSeats, double ticketCost) {
	super();
	this.scheduleid = scheduleid;
	this.flightNumber = flightNumber;
	this.fromPlace = fromPlace;
	this.toPlace = toPlace;
	this.startTime = startTime;
	this.endTime = endTime;
	this.instruments = instruments;
	this.totalBusinessSeats = totalBusinessSeats;
	this.totalNonBusinessSeats = totalNonBusinessSeats;
	this.ticketCost = ticketCost;
}

@Override
public int hashCode() {
	return Objects.hash(endTime, flightNumber, fromPlace, instruments, scheduleid, startTime, ticketCost, toPlace,
			totalBusinessSeats, totalNonBusinessSeats);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Schedules other = (Schedules) obj;
	return Objects.equals(endTime, other.endTime) && Objects.equals(flightNumber, other.flightNumber)
			&& Objects.equals(fromPlace, other.fromPlace) && Objects.equals(instruments, other.instruments)
			&& scheduleid == other.scheduleid && Objects.equals(startTime, other.startTime)
			&& Double.doubleToLongBits(ticketCost) == Double.doubleToLongBits(other.ticketCost)
			&& Objects.equals(toPlace, other.toPlace) && totalBusinessSeats == other.totalBusinessSeats
			&& totalNonBusinessSeats == other.totalNonBusinessSeats;
}



}
