package com.sunyong.spairy.study.design.create.builder.entity;

public class Wheel {

	private String name;
	
	private String type;
	
	private String position;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "name[" + name + "], type[" + type + "], position[" +position + "]";
	}
}
