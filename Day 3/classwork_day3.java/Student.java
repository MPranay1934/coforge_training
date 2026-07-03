package com.coforge.day3;

public class Student {
    private int stdid;
    private String name;
    private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdid, String name, String email) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.email = email;
	}
	/**
	 * @return the stdid
	 */
	public int getStdid() {
		return stdid;
	}
	/**
	 * @param stdid the stdid to set
	 */
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", email=" + email + "]";
	}
    
}
