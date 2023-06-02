package com.example.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Cars {

	@Id
	@TableGenerator(name = "id", allocationSize = 1, initialValue = 0)
	@GeneratedValue(generator = "id", strategy = GenerationType.TABLE)
	private Long id ;
	private int carNumber;
	private String driver;
	@OneToOne(mappedBy = "car")
	@JsonIgnore
	private Trips trip;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Trips getTrip() {
		return trip;
	}
	public void setTrip(Trips trip) {
		this.trip = trip;
	}

	
	
}
