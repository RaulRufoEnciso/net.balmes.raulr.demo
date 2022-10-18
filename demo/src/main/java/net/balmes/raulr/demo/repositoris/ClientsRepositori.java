package net.balmes.raulr.demo.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.balmes.raulr.demo.entitis.Client;

public interface ClientsRepositori extends CrudRepository<Client, Long>{
	
	
	
	public List<Client> findAll();
}
