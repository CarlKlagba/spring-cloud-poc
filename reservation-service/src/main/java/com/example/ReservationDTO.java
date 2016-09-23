package com.example;

public class ReservationDTO {
	private String message;

	
	
	public ReservationDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
