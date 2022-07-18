package com.chocolate.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chocolates")
public class Chocolate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name="chocolate_name",nullable = false)
	private String cname;
	
	@Column(name="chocolate_price",nullable = false)
	private int cprice;
	
	@Column(name="avail_num",nullable = false)
	private int cavailable;
	
	public Chocolate() {
		
	}
	
	public Chocolate(String cname, int cprice, int cavailable) {
		this.cname = cname;
		this.cprice = cprice;
		this.cavailable = cavailable;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public int getCavailable() {
		return cavailable;
	}
	public void setCavailable(int cavailable) {
		this.cavailable = cavailable;
	}
	
	
}
