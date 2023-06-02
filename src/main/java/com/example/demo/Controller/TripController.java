package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Trips;
import com.example.demo.Service.TripSer;
@RestController
@RequestMapping("/trip")
public class TripController {

	@Autowired
	private TripSer ser;
	@GetMapping("/count")
	public long count () {
		return ser.count();
	}
	@GetMapping("")
	public Iterable<Trips> findAll(){
		return ser.findAll();
	}
	@PostMapping("")
	public Trips insert(@RequestBody Trips trip) {
		return ser.insert(trip);
	}
}
