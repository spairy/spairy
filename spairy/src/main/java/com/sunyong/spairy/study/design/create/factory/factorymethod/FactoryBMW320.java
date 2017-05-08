package com.sunyong.spairy.study.design.create.factory.factorymethod;

import com.sunyong.spairy.study.design.create.factory.BMW320;

public class FactoryBMW320 implements FactoryBMW {
	  
    public BMW320 createBMW() {
        return new BMW320();
    }  
}  
