package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.Hotel;

public interface HotelRepository extends  JpaRepository<Hotel, Long>{

	 List<Hotel> findByAvailability(boolean available);
	
}
