package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	private String prodCode;
	private String prodName;
	private double prodCost;
	public Product() {
		super();
	}
	public Product( String prodCode, String prodName, double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodName=" + prodName + ", prodCost="
				+ prodCost + "]";
	}
	
	
}
