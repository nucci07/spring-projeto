package com.vinicius.prjCliente.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String name;

	@Column(name = "preco")
	private double price;

	public Cliente() {
	}

	public Cliente(Long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long GetId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String Getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

}
