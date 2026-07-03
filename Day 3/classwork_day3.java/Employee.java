package com.coforge.day3;

//Java Bean or POJO or Model
public class Employee {
    private int eid;
    private String ename;
    private double salary;
    
    public Employee(int eid, String ename, double salary) { //Constructor
    	this.eid = eid;
    	this.ename = ename;
    	this.salary = salary;
    }
     
    public void setSalary(double salary) { //Setter Method
    	this.salary = salary;
    }
    
    public double getSalart() { //Getter Method
    	return salary;
    }
    
    public void display() {
    	System.out.println("Employee ID :" + eid);
    	System.out.println("Employee Name :" + ename);
    	System.out.println("Salary :" + salary);
    }

}
