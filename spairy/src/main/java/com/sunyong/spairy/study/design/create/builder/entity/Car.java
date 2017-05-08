package com.sunyong.spairy.study.design.create.builder.entity;

import java.util.List;

public class Car {

	private String name;
	
	private Body body;
	
	private Engine engine;
	
	private List<Wheel> wheels;

	public String getName() {
		return name;
	}

	public Car (String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "name[" + name + "], body[" + body.toString() + "], engine[" + engine.toString() +"], wheels[" + wheels.toString() + "]";
	}
}
