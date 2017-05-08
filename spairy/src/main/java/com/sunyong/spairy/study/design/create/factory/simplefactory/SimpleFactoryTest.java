package com.sunyong.spairy.study.design.create.factory.simplefactory;

import com.sunyong.spairy.study.design.create.factory.BMW320;
import com.sunyong.spairy.study.design.create.factory.BMW523;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		BMW320 bmw320 = (BMW320)simpleFactory.create(320);
		BMW523 bmw523 = (BMW523)simpleFactory.create(523);
		System.out.println(bmw320);
		System.out.println(bmw523);
	}
}
