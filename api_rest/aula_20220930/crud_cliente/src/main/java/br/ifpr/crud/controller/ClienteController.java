package br.ifpr.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifpr.crud.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public Cliente listar() {
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano de Tal");
		cliente.setEmail("fulano@gmail.com");
		cliente.setTelefone("54 54543343");
		
		return cliente;
	}

}
