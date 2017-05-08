package com.sunyong.spairy.study.design.create.prototype;

public class House implements Cloneable {

	private int number;
	
	private Door door;

	private Window window;
	
	public int getNumber() {
		return number;
	}

	public House clone() throws CloneNotSupportedException {
		House house = (House) super.clone();
		house.door = door.clone();
		house.window = window.clone();
	    return house;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}
	
}
