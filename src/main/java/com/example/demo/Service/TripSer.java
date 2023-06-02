package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Trips;
import com.example.demo.Repository.TripRep;

@Service
public class TripSer {

	@Autowired
	private TripRep rep;

	public long count () {
		return rep.count();
	}
	
	public Iterable<Trips> findAll(){
		return rep.findAll();
	}
	
	public Trips insert(Trips trip) {
		return rep.save(trip);
	}

}
