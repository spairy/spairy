package com.sunyong.spairy.study.design.create.factory.factorymethod;

import com.sunyong.spairy.study.design.create.factory.BMW320;
import com.sunyong.spairy.study.design.create.factory.BMW523;

public class FactoryMethod {

	public static void main(String[] args) {  
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();  
        BMW320 bmw320 = factoryBMW320.createBMW();  
  
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();  
        BMW523 bmw523 = factoryBMW523.createBMW();  
        
		System.out.println(bmw320);
		System.out.println(bmw523);
    } 
}
