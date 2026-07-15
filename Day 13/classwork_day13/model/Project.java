package com.coforge.model;

public class Project {
	private int projectid;
	private String projectname;
	public Project(int projectid, String projectname) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + "]";
	}
	

}
