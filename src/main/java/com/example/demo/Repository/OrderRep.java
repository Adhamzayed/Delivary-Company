package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Orders;
@Repository
public interface OrderRep extends CrudRepository<Orders,Long>{

}
