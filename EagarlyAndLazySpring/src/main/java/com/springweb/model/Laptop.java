package com.springweb.model;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private int lid;
	private String lname;
	private String lbrand;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLbrand() {
		return lbrand;
	}

	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lbrand=" + lbrand + "]";
	}

	public void lap() {
		System.out.println("laptop lap()");
		
		
	}

}
