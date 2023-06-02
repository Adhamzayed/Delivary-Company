package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Clients;
@Repository
public interface ClientRep extends CrudRepository<Clients,Long>{

}
