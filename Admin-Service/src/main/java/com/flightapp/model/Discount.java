package com.flightapp.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int discountId;
	
	private String DiscountCode;
	
	private int discountPrice;

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountCode() {
		return DiscountCode;
	}

	public void setDiscountCode(String discountCode) {
		DiscountCode = discountCode;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Discount(int discountId, String discountCode, int discountPrice) {
		super();
		this.discountId = discountId;
		DiscountCode = discountCode;
		this.discountPrice = discountPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DiscountCode, discountId, discountPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		return Objects.equals(DiscountCode, other.DiscountCode) && discountId == other.discountId
				&& discountPrice == other.discountPrice;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", DiscountCode=" + DiscountCode + ", discountPrice="
				+ discountPrice + "]";
	}
	
	
	
}
