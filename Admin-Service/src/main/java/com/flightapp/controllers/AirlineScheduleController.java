package com.flightapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.flightapp.exception.ScheduleNotFoundException;
import com.flightapp.model.Schedules;
import com.flightapp.service.AirlineScheduleService;

@Controller
public class AirlineScheduleController {
	
	@Autowired
	private AirlineScheduleService ScheduleService;
	
	@PostMapping("/Sheduleairline")
	public Schedules SheduleAirline(@RequestBody Schedules schedule ) throws ScheduleNotFoundException {
		return ScheduleService.ScheduleAirlines(schedule);
	}
	
	@PutMapping("/updateScheduledAirline/{id}")
	public Schedules updateScheduleAirline(@RequestBody Schedules schedul,@PathVariable (value = "id")int id) throws ScheduleNotFoundException {
		return ScheduleService.updateScheduleAirline(schedul, id);
	}
	
	@DeleteMapping("/deleteScheduledAirline/{id}")
	public void deleteScheduleAirline(@PathVariable (value = "id")int id ) throws ScheduleNotFoundException {
		  ScheduleService.deleteScheduleAirline(id);
	}
	
	@GetMapping("/getScheduledAirline/{id}")
	public Schedules getScheduledAirlineById(@PathVariable int id) throws ScheduleNotFoundException {
		return ScheduleService.getScheduleAirlineById(id);
	}
	
	@GetMapping("/getScheduledAirlines")
	public List<Schedules> getAllScheduledAirlines() {
		return ScheduleService.getAllScheduledAirlines();
		
	}
}
