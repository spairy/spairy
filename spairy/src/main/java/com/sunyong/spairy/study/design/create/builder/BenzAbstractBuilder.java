package com.sunyong.spairy.study.design.create.builder;

import java.util.ArrayList;
import java.util.List;

import com.sunyong.spairy.study.design.create.builder.entity.Body;
import com.sunyong.spairy.study.design.create.builder.entity.Car;
import com.sunyong.spairy.study.design.create.builder.entity.Engine;
import com.sunyong.spairy.study.design.create.builder.entity.Wheel;

public abstract class BenzAbstractBuilder implements Builder {

	Car benz;
	
	private final static String NAME = "benz";
	
	public BenzAbstractBuilder() {
		benz = new Car(NAME);
	}
	
	public void buildeBody() {
		Body body = new Body();
		body.setName(getBodyName());
		benz.setBody(body);
	}

	public void buildeEngine() {
		Engine engine = new Engine();
		engine.setName(getEngineName());
		benz.setEngine(engine);
	}
	
	public void buildeWheels() {
		List<Wheel> wheels = new ArrayList<Wheel>();
		Wheel wheel = new Wheel();
		wheel.setName(getWheelName());
		wheel.setPosition("left front");
		wheels.add(wheel);
		wheel = new Wheel();
		wheel.setName(getWheelName());
		wheel.setPosition("left end");
		wheels.add(wheel);wheel = new Wheel();
		wheel.setName(getWheelName());
		wheel.setPosition("right front");
		wheels.add(wheel);wheel = new Wheel();
		wheel.setName(getWheelName());
		wheel.setPosition("right end");
		wheels.add(wheel);
		benz.setWheels(wheels);
	}
	
	public Car getCar() {
		return benz;
	}
	
	protected abstract String getBodyName();
	protected abstract String getEngineName();
	protected abstract String getWheelName();

}
