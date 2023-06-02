package com.example.demo.Entity;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.TableGenerator;

@Entity
public class Trips {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.TABLE)
	@TableGenerator(name = "id", allocationSize = 1, initialValue = 0)
	private Long id;
	private String centerOffice;
	private String branchOffice;

	@OneToOne
	private Cars car;

	@OneToMany
	private Set<Clients> clients;

	public Trips() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterOffice() {
		return centerOffice;
	}

	public void setCenterOffice(String centerOffice) {
		this.centerOffice = centerOffice;
	}

	public String getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(String branchOffice) {
		this.branchOffice = branchOffice;
	}

	public Cars getCar() {
		return car;
	}

	public void setCar(Cars car) {
		this.car = car;
	}

	public Set<Clients> getClients() {
		return clients;
	}

	public void setClients(Set<Clients> clients) {
		this.clients = clients;
	}

}
