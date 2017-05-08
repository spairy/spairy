package com.sunyong.spairy.study.design.create.prototype;

public class Door implements Cloneable {

	private int number;
	
	public Door clone() throws CloneNotSupportedException {
		Door door = (Door) super.clone();
		return door;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
