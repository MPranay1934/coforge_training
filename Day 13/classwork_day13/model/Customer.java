package com.coforge.model;

import java.util.List;

public class Customer {
	private int customerid;
	private String customername;
	private List<String> emails;
	private List<DeliveryAddress> deliveryaddress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerid, String customername, List<String> emails, List<DeliveryAddress> deliveryaddress) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emails = emails;
		this.deliveryaddress = deliveryaddress;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<DeliveryAddress> getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(List<DeliveryAddress> deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", emails=" + emails
				+ ", deliveryaddress=" + deliveryaddress + "]";
	} 
	
	
}
