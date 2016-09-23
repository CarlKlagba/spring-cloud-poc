package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReservationDTO;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	@Value("${message}")
	String message;
	
	@RequestMapping(value = "/message", method = RequestMethod.GET )
	public ReservationDTO config(){
		return new ReservationDTO(message);
	}
}
