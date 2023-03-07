package com.springboot.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "hotelDetails")
public class Hotel {
	
	
	public Hotel() {
		
	}
	public Hotel(String hotelName , int price, boolean availability) {
		super();
		this.hotelName = hotelName;
		this.price = price;
		this.availability = availability;

		}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	public Hotel(long id) {
		super();
		this.id = id;
	}
	
	@Column(name = "hotel_name")
	private String hotelName;
	
	@Column(name= "price")
	private int price;
	
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Column(name = "availability")
	private boolean availability;
	
}
