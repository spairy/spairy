package com.sunyong.spairy.study.design.create.builder;

import com.sunyong.spairy.study.design.create.builder.entity.Car;

public class BuilderTest {

	public static void main(String[] args) {
	    Productor productor = new Productor();
	    Car benz = productor.productCar(new BenzC200Builder());
	    System.out.println(benz.toString());
	}

}
