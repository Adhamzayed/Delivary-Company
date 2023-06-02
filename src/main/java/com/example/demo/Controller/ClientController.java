package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Clients;
import com.example.demo.Service.ClientSer;
@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientSer ser;
	
	@GetMapping("/count")
	public Long count() {
		return ser.count();
	}
	
	@GetMapping("")
	public Iterable<Clients> findAll(){
		return ser.findAll();
	}
	
	@GetMapping("/byid/{id}")
	public Optional<Clients> findById(@PathVariable Long id) {
		return ser.findById(id);
	} 
	
	@PostMapping("")
	public Clients insert(@RequestBody Clients client) {
		return ser.insert(client);
	}
	
	@PutMapping
	public Clients update(@RequestBody Clients client) {
		return ser.update(client);
	}
}
