package br.ifpr.crud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifpr.crud.model.Cliente;
import br.ifpr.crud.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscar(
			@PathVariable Integer id) {
		Optional<Cliente> optCliente = 
				clienteRepository.findById(id);
		
		if(optCliente.isPresent())
			return new ResponseEntity<Cliente>(
					optCliente.get(), HttpStatus.OK);
		
		return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<Cliente> inserir() {
		//TODO Próxima aula
		return null;
	}

}
