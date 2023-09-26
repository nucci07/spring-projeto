package com.vinicius.prjCliente.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinicius.prjCliente.entities.Cliente;
import com.vinicius.prjCliente.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;

	public void ClienteService(ClienteRepository clienteRepository) {
		 this.clienteRepository = clienteRepository;
	 }
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public Cliente getClienteById(Long id) {
		 return clienteRepository.findById(id).orElse(null);
	}
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
		}
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
		}


}
