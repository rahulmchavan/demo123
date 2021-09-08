package com.flightapp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.exception.ScheduleNotFoundException;
import com.flightapp.model.Airline;
import com.flightapp.model.Schedules;
import com.flightapp.repository.AirlineScheduledRepo;

@Service
public class AirlineScheduleServiceImpl implements AirlineScheduleService {
	
	@Autowired
	private AirlineScheduledRepo scheduled;

	@Override
	public Schedules ScheduleAirlines(Schedules schedule) throws ScheduleNotFoundException {
		if(schedule.getFlightNumber()!=null) {
		return scheduled.save(schedule);}
		else{
			throw new ScheduleNotFoundException("Ailine is Not Scheduled...!");
		}
	}

	@Override
	public Schedules getScheduleAirlineById(int id) throws ScheduleNotFoundException {
		if(scheduled.existsById(id)) {
			return scheduled.getById(id);	
		}else
		{
			throw new ScheduleNotFoundException();
		}
	
	}

	@Override
	public Schedules updateScheduleAirline(Schedules schedul, int id) throws ScheduleNotFoundException {
		if(scheduled.existsById(id)) {
		Schedules s=scheduled.getById(id);
		s.setFlightNumber(s.getFlightNumber());
		s.setFromPlace(s.getFromPlace());
		s.setToPlace(s.getToPlace());
		s.setStartTime(s.getStartTime());
		s.setEndTime(s.getEndTime());
		s.setInstruments(s.getInstruments());
		s.setTotalBusinessSeats(s.getTotalBusinessSeats());
		s.setTotalNonBusinessSeats(s.getTotalNonBusinessSeats());
		s.setTicketCost(s.getTicketCost());
		return scheduled.save(s);
 	}else{
 		throw new ScheduleNotFoundException(" Schedule Not Updated"+id);
 	}
	}

	@Override
	public void deleteScheduleAirline(int id) throws ScheduleNotFoundException {
		if(scheduled.existsById(id)){
		scheduled.deleteById(id);
		}else {
			throw new ScheduleNotFoundException("Schedule airline is not deleted"+id);
		}
		
	}

	@Override
	public List<Schedules> getAllScheduledAirlines() {
		
		return scheduled.findAll();
	}
	
	

}
