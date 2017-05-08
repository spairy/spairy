package com.sunyong.spairy.study.design.create.builder;

import com.sunyong.spairy.study.design.create.builder.entity.Car;

public class Productor {

	public Car productCar (Builder builder) {
		builder.buildeBody();
		builder.buildeEngine();
		builder.buildeWheels();
		return builder.getCar();
	}
}
