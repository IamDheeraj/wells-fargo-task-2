package com.wellsfargo.counselor.entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int portfolioId;
	
	@Column(nullable = false)
	private int clientId;
	
	@Column(nullable = false)
	private Date creationDate;
	
	@OneToOne(mappedBy = "portfolio")
	private Client client;
	
	@OneToMany(mappedBy = "port_folio")
	private Security security;
	
	
	protected Portfolio() {

	}
	
	public Portfolio(int clientId, Date creationDate) {
		this.clientId = clientId;
		this.creationDate = creationDate;
	}


	public int getPortfolioId() {
		return portfolioId;
	}


	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
	
	
	
	
}
