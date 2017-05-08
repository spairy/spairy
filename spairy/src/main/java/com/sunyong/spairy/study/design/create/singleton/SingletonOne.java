package com.sunyong.spairy.study.design.create.singleton;

public class SingletonOne {

	// 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	private static SingletonOne instance = null;
	
	// 单例模式的重点，私有化构造方法
	private SingletonOne() {}
	
	// 静态工程方法，创建实例 
	public static SingletonOne getInstance() {
	    if (instance == null) {
	        instance = new SingletonOne();
	    }
	    return instance;
	}
	
	// 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 
    public Object readResolve() {
        return instance;
    }
}