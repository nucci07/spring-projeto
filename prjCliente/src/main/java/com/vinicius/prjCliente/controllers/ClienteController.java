package com.vinicius.prjCliente.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vinicius.prjCliente.entities.Cliente;
import com.vinicius.prjCliente.servicies.ClienteService;

public class ClienteController {

	private final ClienteService clienteService;
	
	public ClienteController (ClienteService clienteService) {
		this.clienteService =clienteService;
	}

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}

	@GetMapping("/{id}")
	public Cliente getProduto(@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}

	@GetMapping
	public List<Cliente> getAllProdutos() {
		return clienteService.getAllCliente();
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}

}
