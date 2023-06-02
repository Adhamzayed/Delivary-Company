package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Cars;
import com.example.demo.Service.CarSer;
@Component

public class StartUp implements CommandLineRunner{

	@Autowired
	private CarSer ser;
	
	@Override
	public void run(String... args) throws Exception {
		if(ser.count()==0) {
			
			Cars c=new Cars();
			c.setCarNumber(1010);
			c.setDriver("Ahmed");
			
			Cars c1=new Cars();
			c1.setCarNumber(2020);
			c1.setDriver("Hassan");
			
			Cars c2=new Cars();
			c2.setCarNumber(3030);
			c2.setDriver("Magdy");
			
			Cars c3=new Cars();
			c3.setCarNumber(4040);
			c3.setDriver("Ibrahem");
			
			ser.insert(c);
			ser.insert(c1);
			ser.insert(c2);
			ser.insert(c3);
		}
	}

}
