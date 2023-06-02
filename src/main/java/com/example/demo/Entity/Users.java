package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
//@NamedQuery(name = "Users.FindByOrder",query = "select us from User us where us.orders.id from 1 to3")
public class Users {

	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.TABLE)
	@TableGenerator(name = "id", allocationSize = 1, initialValue = 0)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = Orders.class)
//	private List<Orders> orders;
//	
//	@OneToMany(mappedBy = "users")
//	private List<Trips> trips;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public List<Orders> getOrders() {
//		return orders;
//	}
//
//	public void setOrders(List<Orders> orders) {
//		this.orders = orders;
//	}
//
//	public List<Trips> getTrips() {
//		return trips;
//	}
//
//	public void setTrips(List<Trips> trips) {
//		this.trips = trips;
//	}

	
	
	
}
