package com.sunyong.spairy.common.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="zhu jie shi lan jie add caozuo")
	public void add(){ System.out.println("DemoAnnotationService add.");}
}
