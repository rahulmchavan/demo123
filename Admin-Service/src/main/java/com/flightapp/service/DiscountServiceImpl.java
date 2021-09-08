package com.flightapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.model.Discount;
import com.flightapp.repository.DiscountRepo;

@Service
public class DiscountServiceImpl implements DiscountService {
	
	@Autowired
	private DiscountRepo discountRepo;

	@Override
	public Discount AddDiscount(Discount discount) {
		return discountRepo.save(discount);
	}

	@Override
	public Discount updateDiscount(Discount discount, int id) {
		
		Discount d=discountRepo.getById(id);
		d.setDiscountCode(discount.getDiscountCode());
		d.setDiscountPrice(discount.getDiscountPrice());
		return	discountRepo.save(d);
	}

	@Override
	public void DeleteDiscount(int id) {
		 	discountRepo.deleteById(id);
		
		
	}

	
}
