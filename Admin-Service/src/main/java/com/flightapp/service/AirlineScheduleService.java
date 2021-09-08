package com.flightapp.service;

import java.util.List;

import com.flightapp.exception.ScheduleNotFoundException;
import com.flightapp.model.Schedules;

public interface AirlineScheduleService {
	
	Schedules ScheduleAirlines(Schedules schedule) throws ScheduleNotFoundException;
	
	Schedules getScheduleAirlineById(int id) throws ScheduleNotFoundException;
	
	Schedules  updateScheduleAirline(Schedules schedul, int id) throws ScheduleNotFoundException;
	
	void deleteScheduleAirline(int id) throws ScheduleNotFoundException;

	List<Schedules> getAllScheduledAirlines();

}
