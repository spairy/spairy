package com.sunyong.spairy.common.email;

import org.apache.commons.mail.SimpleEmail;


public class EmailTest
{
	public static void main(final String[] args) throws Exception
	{
		try {
			System.out.println("Send Email start ...");
			final SimpleEmail email = new SimpleEmail();
			/*
			email.setHostName("smtp.126.com");
			email.setSmtpPort(25);
			email.setFrom("libyb2b@126.com", "libyb2b");
			email.setAuthentication("libyb2b@126.com", "libyb2b123");
			*/
			email.setHostName("192.168.2.122");
			email.setSmtpPort(25);
			email.setFrom("ligou@liby.com.cn", "ligou");
			email.setAuthentication("ligou@liby.com.cn", "teR#@5vY");
			
			email.addTo("979943456@qq.com", "sunyong");
			email.addTo("yong.c.sun@accenture.com", "yong.c.sun");
			email.setSubject("Test message");
			email.setMsg("This is a simple test of commons-email from jar");
			email.send();
			System.out.println("Send Email end ...");
		}
		catch (final Exception e)
		{
			System.out.println("Send Email exception ...");
			e.printStackTrace();
		}
	}
}
