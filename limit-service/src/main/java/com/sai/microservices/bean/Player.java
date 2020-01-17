package com.sai.microservices.bean;

public class Player {

	private String name;
	private String pid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", pid=" + pid + "]";
	}
	
}
