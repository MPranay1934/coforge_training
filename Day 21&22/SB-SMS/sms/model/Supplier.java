package com.coforge.sms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_supp")
public class Supplier {

    @Id
    @Column(name = "sid")
    @NotNull
    private long sid;

    @Column(name = "sname")
    @NotBlank
    private String sname;
    
    @Column(name = "city")
    @NotBlank
    private String city;

    public Supplier() {
    }

	public Supplier(@NotNull long sid, @NotBlank String sname, @NotBlank String city) {
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

	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}

}