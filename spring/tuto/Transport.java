package com.spring.tuto;

public class Transport {
	Train train;
	Bus bus;
	Auto auto;
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	@Override
	public String toString() {
		return "Transport [train=" + train + ", bus=" + bus + ", auto=" + auto + "]";
	}
	
}
