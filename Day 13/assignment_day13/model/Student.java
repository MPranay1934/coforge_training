package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {		
		private int sid;
		private String sname;
		private Address address;
		private List<String> subjects;
		private Set<String> skills;
		private Map<String,Integer> marks;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int sid, String sname, Address address, List<String> subjects, Set<String> skills,
				Map<String, Integer> marks) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.address = address;
			this.subjects = subjects;
			this.skills = skills;
			this.marks = marks;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public List<String> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}
		public Set<String> getSkills() {
			return skills;
		}
		public void setSkills(Set<String> skills) {
			this.skills = skills;
		}
		public Map<String, Integer> getMarks() {
			return marks;
		}
		public void setMarks(Map<String, Integer> marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", subjects=" + subjects
					+ ", skills=" + skills + ", marks=" + marks + "]";
		}
		public void displayStudentDetails() {

		    System.out.println("========== Student Details ==========");

		    System.out.println("Student Id      : " + sid);
		    System.out.println("Student Name    : " + sname);

		    System.out.println("City            : " + address.getCity());
		    System.out.println("State           : " + address.getState());

		    System.out.println("\nSubjects Enrolled");
		    System.out.println("---------------------");

		    for(String subject : subjects) {
		        System.out.println(subject);
		    }

		    System.out.println("\nTechnical Skills");
		    System.out.println("---------------------");

		    for(String skill : skills) {
		        System.out.println(skill);
		    }

		    System.out.println("\nMarks");
		    System.out.println("---------------------");

		    for(Map.Entry<String,Integer> entry : marks.entrySet()) {
		        System.out.println(entry.getKey() + " : " + entry.getValue());
		    }
		}
		
		

}
