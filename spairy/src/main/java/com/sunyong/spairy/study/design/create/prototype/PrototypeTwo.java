package com.sunyong.spairy.study.design.create.prototype;

public class PrototypeTwo implements Cloneable {

	private int number;
	
	private House house;

	public PrototypeTwo clone() throws CloneNotSupportedException {
		PrototypeTwo proto = (PrototypeTwo) super.clone();
		proto.house = house.clone();
	    return proto;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
