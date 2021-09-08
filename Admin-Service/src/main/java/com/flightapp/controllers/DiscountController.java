package com.flightapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flightapp.model.Discount;
import com.flightapp.service.DiscountService;

@Controller
public class DiscountController {
	
	@Autowired
	private DiscountService dService;
	
	@PostMapping("/adddiscount")
	public Discount AddDiscount(@RequestBody Discount discount) {
		return dService.AddDiscount(discount); 
	}
	
	
	@PutMapping("/updatediscount/{id}")
	public Discount updateDiscount(@RequestBody Discount discount, @PathVariable int id) {
		return dService.updateDiscount(discount, id);
	}

	@DeleteMapping("/deletediscount/{id}")
	public void deleteDiscount(@PathVariable int id) {
		dService.DeleteDiscount(id);
	}
	
}
