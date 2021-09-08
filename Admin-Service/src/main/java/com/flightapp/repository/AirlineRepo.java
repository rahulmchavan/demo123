package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.model.Airline;

public interface AirlineRepo extends JpaRepository<Airline, Integer> {

}
