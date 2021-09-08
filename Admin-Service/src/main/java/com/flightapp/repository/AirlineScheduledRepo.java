package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.model.Schedules;

public interface AirlineScheduledRepo extends JpaRepository<Schedules, Integer> {
	

}
