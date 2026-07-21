package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_pro")
public class Product { //JavaBean
	@Id	
	@Column(name = "pid", length =5)	
	private int pid;
	@Column(name = "pname", length =20)
	private String pname;
	@Column(name = "pprice", length =5)
	private int pprice;
	@Column(name = "pquantity", length =5)
	private int pquantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pprice, int pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pquantity = pquantity;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}
	
	
	
	
	
}
