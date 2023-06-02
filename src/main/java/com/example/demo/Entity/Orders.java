package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;
@Entity
public class Orders {
	@Id
	@TableGenerator(name = "id", allocationSize = 1, initialValue = 0)
	@GeneratedValue(generator = "id", strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private long count;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	

	
}
