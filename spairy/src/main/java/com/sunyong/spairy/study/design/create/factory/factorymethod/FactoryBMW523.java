package com.sunyong.spairy.study.design.create.factory.factorymethod;

import com.sunyong.spairy.study.design.create.factory.BMW523;

public class FactoryBMW523 implements FactoryBMW {  

	public BMW523 createBMW() {  
        return new BMW523();  
    }  
}
