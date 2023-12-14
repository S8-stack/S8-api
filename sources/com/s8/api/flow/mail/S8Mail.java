package com.s8.api.flow.mail;

import java.io.IOException;

public interface S8Mail {

	
	
	
	/**
	 * 	Message emailMessage = new MimeMessage(session);

			//emailMessage.setFrom(new InternetAddress(Credentials.USERNAME));
			emailMessage.setFrom(new InternetAddress(Credentials.USERNAME, "WebService master"));

			emailMessage.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(receiverEmail));
			emailMessage.setSubject(subject);
			MimeBodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText(messageText);
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			DataSource source = new FileDataSource(imagePath);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);
			emailMessage.setContent(multipart);
	 * @throws IOException 
	 */
	
	
	
	public void setDisplayedSender(String name) throws IOException;
	
	/**
	 * 
	 * @param email
	 * @throws IOException 
	 */
	public void setRecipient(String email) throws IOException;
	
	
	
	/**
	 * 
	 * @param text
	 * @throws IOException 
	 */
	public void setSubject(String text) throws IOException;
	
	
	/**
	 * 
	 * @param text
	 * @throws IOException 
	 */
	public void appendText(String text) throws IOException;
}
