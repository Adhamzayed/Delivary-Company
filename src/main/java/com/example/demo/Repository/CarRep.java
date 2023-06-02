package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Cars;

@Repository
public interface CarRep extends CrudRepository<Cars,Long>{

}
