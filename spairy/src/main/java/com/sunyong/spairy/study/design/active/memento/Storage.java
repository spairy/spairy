package com.sunyong.spairy.study.design.active.memento;

public class Storage {
	
	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
