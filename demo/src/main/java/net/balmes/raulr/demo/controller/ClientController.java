package net.balmes.raulr.demo.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.balmes.raulr.demo.entitis.Client;
import net.balmes.raulr.demo.repositoris.ClientsRepositori;


@RestController
@RequestMapping("api")
public class ClientController {
	
	@Autowired						// Dice que Spring cree el el objeto
	ClientsRepositori clientRep; 	// el new lo hace Spring
	
	@GetMapping("clients/{id}")
	public Client getClient(@PathVariable long id) {
		
		return clientRep.findById(id).get();
	}
	
	@GetMapping("clients")
	public Iterable<Client> getClient() {
		
		return clientRep.findAll();
	}
	@PostMapping("clients")
	public Client altaClient(@RequestBody Client client) {
		clientRep.save(client);
		
		return client;
	}
	@DeleteMapping
	public Client deleteClient(@RequestBody Client client) {
		clientRep.delete(client);
		
		return client;
	}
	@PutMapping
	public Client putClient(@RequestBody Client client) {
		//clientRep.(client);
		
		return client;
	}
	
}
