package com.springcore_autowiring;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adress=" + adress + "]";
	}
	private String name ;
	private int id;
	private Adress adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
}
