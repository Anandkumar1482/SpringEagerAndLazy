package com.springweb.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springweb.model.Laptop;

@Component
//@Scope(value = "prototype")
public class Student {
	private int sid;
	private String sname;

	@Autowired
	@Qualifier("lap1")
	Laptop laptop;

	public Student() {
		System.out.println("student obj is intialized");
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", laptop=" + laptop + "]";
	}

	public void show() {
		System.out.println("in show()");
		laptop.lap();

	}

}
