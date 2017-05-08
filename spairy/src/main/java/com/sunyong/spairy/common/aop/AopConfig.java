package com.sunyong.spairy.common.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sunyong.spairy.common.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
