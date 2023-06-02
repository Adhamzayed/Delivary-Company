package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Orders;
import com.example.demo.Service.OrderSer;
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderSer ser;

	@GetMapping("/count")
	public Long count () {
		return ser.count();
	}
	
	@GetMapping("")
	public Iterable<Orders> findAll(){
		return ser.findAll();
	}
	
	@PostMapping("")
	public Orders insert(@RequestBody Orders order) {
		return ser.insert(order);
	}
}

