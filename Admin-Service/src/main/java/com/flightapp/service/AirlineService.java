package com.flightapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flightapp.exception.AirlineNotAddedException;
import com.flightapp.exception.AirlineNotFoundException;
import com.flightapp.model.Airline;


@Service
public interface AirlineService {

	Airline AddAirlines(Airline airline) throws AirlineNotAddedException;
	
	List<Airline> getAllAirlines() throws AirlineNotFoundException;
	
	Airline getAirlineById(int id) throws AirlineNotFoundException;
	
	Airline updateAirline(Airline airline, int id) throws AirlineNotAddedException;
	
	void deleteAirline(int id) throws AirlineNotFoundException;
	
	 
	 
	 
	
	

}
