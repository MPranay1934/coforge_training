package com.coforge.pms.dto;

public class SupplierDTO {

    private long sid;
    private String sname;
    private String city;

    public SupplierDTO() {
    }

	public SupplierDTO(long sid, String sname, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

   
}