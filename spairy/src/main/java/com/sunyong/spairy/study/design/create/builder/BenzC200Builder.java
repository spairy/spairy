package com.sunyong.spairy.study.design.create.builder;

public class BenzC200Builder extends BenzAbstractBuilder {

	@Override
	protected String getBodyName() {
		return "C200 Body";
	}

	@Override
	protected String getEngineName() {
		return "C200 Engine";
	}

	@Override
	protected String getWheelName() {
		return "C200 Wheel";
	}

}
