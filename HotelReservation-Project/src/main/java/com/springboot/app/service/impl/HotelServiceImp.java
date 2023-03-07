package com.springboot.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.model.Hotel;
import com.springboot.app.repository.HotelRepository;
import com.springboot.app.service.HotelService;

@Service
public class HotelServiceImp implements HotelService{
	
	private HotelRepository hotelRepository;

	public HotelServiceImp(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}
	
	@Override
	public List<Hotel> getallHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public List<Hotel> getHotelsByAvailability() {
        return hotelRepository.findByAvailability(true);
    }
	
	
	
	
}
