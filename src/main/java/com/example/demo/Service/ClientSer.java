package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Clients;
import com.example.demo.Repository.ClientRep;
@Service
public class ClientSer {
	@Autowired
	private ClientRep rep;

	public Long count() {
		return  rep.count();
	}

	public Iterable<Clients> findAll() {
		return rep.findAll();
	}
	
	public Optional<Clients> findById(Long id) {
		return rep.findById(id);
	}

	public Clients insert(Clients client) {
		return rep.save(client);
	}

	public Clients update(Clients client) {
		Clients current = rep.findById(client.getId()).get();
		current.setFirstName(client.getFirstName());
		current.setLastName(client.getLastName());
		current.setEmail(client.getEmail());
		current.setPassword(client.getPassword());
		current.setOrders(client.getOrders());
		return rep.save(current);
	}

	public void delete(Clients client) {
		rep.delete(client);
	}

	public void deleteAll() {
		rep.deleteAll();
	}
}
