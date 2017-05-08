package com.sunyong.spairy.study.design.create.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		PrototypeTwo pro = new PrototypeTwo();
		pro.setNumber(100);
		House house = new House();
		house.setNumber(1024);
		Door door = new Door();
		door.setNumber(10);
		Window window = new Window();
		window.setNumber(11);
		house.setDoor(door);
		house.setWindow(window);
		pro.setHouse(house);

		try {
			PrototypeTwo newpro = pro.clone();
			System.out.println(pro);
			System.out.println(newpro);
			System.out.println(pro.getHouse());
			System.out.println(newpro.getHouse());
			System.out.println(pro.getHouse().getDoor());
			System.out.println(newpro.getHouse().getDoor());
			System.out.println(pro.getHouse().getWindow());
			System.out.println(newpro.getHouse().getWindow());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
