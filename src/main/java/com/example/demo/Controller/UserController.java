package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserSer;
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserSer ser;
	@GetMapping("/count")
	public long count () {
		return ser.count();
	}
	@GetMapping("")
	public Iterable<Users> findAll(){
		return ser.findAll();
	}
	@PostMapping("")
	public Users insert(@RequestBody Users user) {
		return ser.insert(user);
	}
	
}
