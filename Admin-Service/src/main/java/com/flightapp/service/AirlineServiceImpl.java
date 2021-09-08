package com.flightapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.flightapp.exception.AirlineNotAddedException;
import com.flightapp.exception.AirlineNotFoundException;
import com.flightapp.model.Airline;
import com.flightapp.repository.AirlineRepo;

@Service
public class AirlineServiceImpl implements AirlineService {
	
	@Autowired
	private AirlineRepo airlinerepo;

	@Override
	public Airline AddAirlines(Airline airline) throws AirlineNotAddedException  {
		if(airline.getAirlineName()!=null){
		return airlinerepo.save(airline);
		}
		else{
			throw new AirlineNotAddedException();
		}
	}

	@Cacheable(value="airlines")
	@Override
	public List<Airline> getAllAirlines() {
		System.out.println("Get All Airlines.....................................");
		return airlinerepo.findAll();
	}

	
	@Override
	public Airline getAirlineById(int id) throws AirlineNotFoundException  {
		
		
		// TODO Auto-generated method stub
		Optional<Airline> airlin= airlinerepo.findById(id);
		if(airlin.isPresent()) {
			return airlin.get();
		}else 
		{
			throw new AirlineNotFoundException("Airline Not Found Xception");
		}
		 
	}

	
	@Override
	public Airline updateAirline(Airline airline, int id) throws AirlineNotAddedException {
		if(airlinerepo.existsById(id)) {
		
		Airline airline1=airlinerepo.getById(id);
		airline1.setAddress(airline1.getAddress());
		airline1.setAirlineId(airline1.getAirlineId());
		airline1.setAirlineName(airline1.getAirlineName());
		airline1.setContactNumber(airline.getContactNumber());
		airline1.setIsDisabled(airline.getIsDisabled());
		return  airlinerepo.save(airline1);
	}else {
		throw new AirlineNotAddedException("Airline not updated");
	}
	}

	
	@Override
	public void deleteAirline(int id) throws AirlineNotFoundException {
		if(airlinerepo.existsById(id)) {
			airlinerepo.deleteById(id);
		}else {
			throw new AirlineNotFoundException();
		}
		
	}
}
