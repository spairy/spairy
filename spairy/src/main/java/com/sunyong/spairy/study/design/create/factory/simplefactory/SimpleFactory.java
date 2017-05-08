package com.sunyong.spairy.study.design.create.factory.simplefactory;

import com.sunyong.spairy.study.design.create.factory.BMW;

public class SimpleFactory {

	public BMW create(int type) {
		switch (type) {
			case 320:
				return new BMW();
			case 523:
				return new BMW();
			default:
				break;
		}
		return null;
	}
}
