package net.balmes.raulr.demo.entitis;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client { //Plain Old Java Object (POJO)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String cognoms;
	private LocalDate dataAlta;
	public Client() { // Sin argumentos
		
	}
	
	public Client(String nom, String cognoms, LocalDate dataAlta) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.dataAlta = dataAlta;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public LocalDate getDataAlta() {
		return dataAlta;
	}
	public void setDataAlta(LocalDate dataAlta) {
		this.dataAlta = dataAlta;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", cognoms=" + cognoms + ", dataAlta=" + dataAlta + "]";
	}
	
	
}
