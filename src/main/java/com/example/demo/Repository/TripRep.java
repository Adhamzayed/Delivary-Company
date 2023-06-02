package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Trips;
@Repository
public interface TripRep extends CrudRepository<Trips,Long>{

}
