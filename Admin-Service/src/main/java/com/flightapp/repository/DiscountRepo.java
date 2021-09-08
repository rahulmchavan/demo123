package com.flightapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.model.Discount;

public interface DiscountRepo extends JpaRepository<Discount, Integer> {

	
	
}
