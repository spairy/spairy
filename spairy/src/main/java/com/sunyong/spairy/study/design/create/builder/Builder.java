package com.sunyong.spairy.study.design.create.builder;

import com.sunyong.spairy.study.design.create.builder.entity.Car;

public interface Builder {
	
	void buildeBody();
	
	void buildeEngine();
	
	void buildeWheels();
	
	Car getCar();
}
