package com.vinicius.prjCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.prjCliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}