package br.ifpr.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifpr.crud.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano de Tal");
		cliente.setEmail("fulano@gmail.com");
		cliente.setTelefone("54 54543343");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Beltrano de Tal");
		cliente2.setEmail("beltrano@yahoo.com.br");
		cliente2.setTelefone("46 434344433");
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente);
		lista.add(cliente2);
		
		return lista;
	}

}
