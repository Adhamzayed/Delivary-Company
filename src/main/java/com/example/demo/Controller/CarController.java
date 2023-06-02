package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Cars;
import com.example.demo.Service.CarSer;
@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarSer ser;
	@GetMapping("/count")
	public long count() {
		return ser.count();
	}
	@GetMapping("")
	public Iterable<Cars> findAll(){
		return ser.findAll();
	}
	@PostMapping("")
	public Cars insert(@RequestBody Cars car) {
		return ser.insert(car);
	}
}
