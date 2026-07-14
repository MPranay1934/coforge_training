package com.coforge.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tbl_course")
public class Course {
	@Id
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	
	  @ManyToMany(mappedBy = "courses")
	    private List<Student> student;
	  
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
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

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
