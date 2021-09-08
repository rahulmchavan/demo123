package com.flightapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId;
	
	private String airlineName;
	
	private String contactNumber;
	
	private String address;
	
	private Boolean isDisabled;

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", contactNumber=" + contactNumber
				+ ", address=" + address + ", isDisabled=" + isDisabled + "]";
	}

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(int airlineId, String airlineName, String contactNumber, String address, Boolean isDisabled) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.isDisabled = isDisabled;
	}

	
}
