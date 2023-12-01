package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int securityId;
	
	@Column(nullable = false)
	private int portfolioId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private double purchasePrice;
	
	@Column(nullable = false)
	private Date purchaseDate;
	
	@Column(nullable = false)
	private int quantity;
	
	public Security(int portfolioId, String name, String category, double purchasePrice, Date purchaseDate,
			int quantity) {
		this.portfolioId = portfolioId;
		this.name = name;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quantity = quantity;
	}
	
	@ManyToOne
	private Portfolio port_folio;
	
	protected Security() {
		
	}
	
	public int getSecurityId() {
		return securityId;
	}

	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
}
