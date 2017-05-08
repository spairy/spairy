package com.sunyong.spairy.common.email;

import org.apache.commons.mail.HtmlEmail;

public class HybrisEmailTest {

	@SuppressWarnings("deprecation")
	public static void main(final String[] args) throws Exception {
		String server = "192.168.2.122";
		int smtpport = 25;
		String from = "ligou@liby.com.cn";
		String replyto = "979943456@qq.com";
		String user = "ligou@liby.com.cn";
		String password = "teR#@5vY";
		String to = "979943456@qq.com";
		String toname = "979943456@qq.com";
		String subject = "ligou";
		String body = "<html>This is email body</html>";
		
		boolean useTLS = true;
		try {
			System.out.println("Send Email start ...");

			HtmlEmail email = new HtmlEmail();
			email.setHostName(server);// 216
			email.setSmtpPort(smtpport);// 219
			email.setFrom(from);// 222
			email.addReplyTo(replyto);// 226
			email.setAuthentication(user, password);// 230
			email.setTLS(useTLS);
			email.setCharset("UTF-8");
			email.addTo(to, toname);
			email.setSubject(subject);
			email.setHtmlMsg(body);
			final String messageID = email.send();
			
			System.out.println("Send Email messageID: " + messageID);
		} catch (final Exception e) {
			System.out.println("Send Email exception ...");
			System.out.println("e.message: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
