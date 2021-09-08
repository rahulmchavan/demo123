package com.flightapp.service;

import com.flightapp.model.Discount;

public interface DiscountService {
	

	public Discount AddDiscount(Discount discount);
	
	public Discount updateDiscount(Discount discount, int id);
	
	public void DeleteDiscount(int id);
	
}
