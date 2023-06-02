package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Orders;
import com.example.demo.Repository.OrderRep;
@Service
public class OrderSer {


	@Autowired
	private OrderRep rep;
	
	public long count() {
		return rep.count();
	}
	
	public Iterable<Orders> findAll(){
		return rep.findAll();
	}
	
	public Orders insert(Orders order) {
		return rep.save(order);
	}

}
