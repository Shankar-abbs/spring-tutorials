package com.codinghub.tightcoupling;

public class Special2 {

	RBI rbi = new Hdfc();

	
	public void getMinBlanace() {
		System.out.println(rbi.minBalance());
	}
}
