package com.flightapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.exception.AirlineNotAddedException;
import com.flightapp.exception.AirlineNotFoundException;
import com.flightapp.model.Airline;
import com.flightapp.service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	@PostMapping("/saveairline")
	public Airline addAirline(@RequestBody Airline airline ) throws AirlineNotAddedException{
			return	airlineService.AddAirlines(airline);			
	}
	
	@GetMapping("/airline/{id}")
	public Airline getAirlineById(@PathVariable(value = "id")int id) throws AirlineNotAddedException, AirlineNotFoundException {
		return airlineService.getAirlineById(id);
	}
	
	@GetMapping("getallairlines")
	public List<Airline> getAllAirlines() throws AirlineNotFoundException {
		System.out.println("Request for get all airlines.....!");
		return airlineService.getAllAirlines();
	}
	
	@PutMapping("/airline/{id}")
	public Airline updateAirline(@PathVariable(value = "id") int id, @RequestBody Airline airline) throws AirlineNotAddedException {
		return airlineService.updateAirline(airline, id);
	}
	
	@DeleteMapping("/airline/{id}")
	public void deleteAirline(@PathVariable(value="id") int id) throws AirlineNotFoundException {
		airlineService.deleteAirline(id);
	}
	
 

}
