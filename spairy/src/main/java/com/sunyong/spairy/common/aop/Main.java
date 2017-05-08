package com.sunyong.spairy.common.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		DemoAnnotationService demoAnnotionService = context.getBean(DemoAnnotationService.class);
		DemoMethodService methodSerivce = context.getBean(DemoMethodService.class);
		
		demoAnnotionService.add();
		methodSerivce.add();
		
		context.close();
	}
}
