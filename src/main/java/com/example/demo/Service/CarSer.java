package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cars;
import com.example.demo.Repository.CarRep;

@Service
public class CarSer {

	@Autowired
	private CarRep rep;
	
	public long count() {
		return rep.count();
	}
	
	public Iterable<Cars> findAll(){
		return rep.findAll();
	}
	
	public Cars insert(Cars car) {
		return rep.save(car);
	}
	
}
