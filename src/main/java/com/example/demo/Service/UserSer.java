package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRep;

@Service
public class UserSer {

	@Autowired
	private UserRep rep;
	
	public long count () {
		return rep.count();
	}
	
	public Iterable<Users> findAll(){
		return rep.findAll();
	}
	
	public Users insert(Users user) {
		return rep.save(user);
	}
	
}
