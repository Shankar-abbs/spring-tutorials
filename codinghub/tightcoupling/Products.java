package com.codinghub.tightcoupling;

public class Products {
	int pid;
	String pname;
	double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
