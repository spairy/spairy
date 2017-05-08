package com.sunyong.spairy.study.design.create.prototype;

public class Window implements Cloneable {

	private int number;
	
	public Window clone() throws CloneNotSupportedException {
		Window window = (Window) super.clone();
		return window;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
