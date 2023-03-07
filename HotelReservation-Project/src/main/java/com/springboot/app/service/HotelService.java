package com.springboot.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.model.Hotel;



public interface HotelService {

	Hotel saveHotel(Hotel hotel);

	List<Hotel> getallHotels();


	List<Hotel> getHotelsByAvailability();
	



}
