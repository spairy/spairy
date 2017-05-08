package com.sunyong.spairy.study.design.create.builder.entity;

public class Engine {

	private String name;
	
	private String type;

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

	@Override
	public String toString() {
		return "name[" + name + "], type[" + type + "]";
	}
}
