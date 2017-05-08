package com.sunyong.spairy.study.design.active.memento;

public class Test {

	public static void main(String[] args) {
		
		// åˆ›å»ºåŽŸå§‹ç±»
		Original origi = new Original("egg");

		// åˆ›å»ºå¤‡å¿˜å½•
		Storage storage = new Storage(origi.createMemento());

		// ä¿®æ”¹åŽŸå§‹ç±»çš„çŠ¶æ€�
		System.out.println("åˆ�å§‹åŒ–çŠ¶æ€�ä¸ºï¼š" + origi.getValue());
		origi.setValue("niu");
		System.out.println("ä¿®æ”¹å�Žçš„çŠ¶æ€�ä¸ºï¼š" + origi.getValue());

		// å›žå¤�åŽŸå§‹ç±»çš„çŠ¶æ€�
		origi.restoreMemento(storage.getMemento());
		System.out.println("æ�¢å¤�å�Žçš„çŠ¶æ€�ä¸ºï¼š" + origi.getValue());
	}
}
