package com.springboot.app.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Hotel;
import com.springboot.app.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotellController {
	 
	
	private HotelService hotelService;
	
	public HotellController(HotelService hotelService){
		super();
		this.hotelService = hotelService;

		
	}
	
	// build add hotels REST API
	@PostMapping("/add")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		//System.out.print(hotel.getHotelName());
		//System.out.print(hotel.getPrice());
		
		return new ResponseEntity<Hotel>(hotelService.saveHotel(hotel),HttpStatus.CREATED);
	}
	
	// build get all hotels REST API
	@GetMapping("/fetch")
	public List<Hotel> getallHotels() {
		 //return new Hotel();
		return hotelService.getallHotels();
	}
	
	
	// build get available hotels REST API
	@GetMapping("/available")
    public List<Hotel> getAvailableHotels() {
        return hotelService.getHotelsByAvailability();
    }
	
	
	
	
//	@GetMapping("/l")
//	public Hotel getHotel() {
//		 //return new Hotel();
//		return new Hotel("aa",90,true);
//	}
//	
	
}
