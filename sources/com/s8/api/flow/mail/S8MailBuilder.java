package com.s8.api.flow.mail;

/**
 * 
 * A Simple Mail Builder interface.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public interface S8MailBuilder {

	
	
	
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
	
	
	
	/**
	 * Set the displayed name.
	 * @param name the displayed name
	 */
	public void setDisplayedSender(String name);
	
	/**
	 * Set the recipient email
	 * @param email the email of the recipient
	 */
	public void setRecipient(String email);
	
	
	
	/**
	 * Set the subject
	 * @param text the subject
	 */
	public void setSubject(String text);
	
	
	

	/**
	 * Set wrapper style
	 * @param CSS_classname the CSS classname
	 * @param CSS_style the CSS style
	 */
	public void html_setWrapperStyle(String CSS_classname, String CSS_style);
	
	
	/**
	 * Append base element
	 * 
	 * @param tag the tag
	 * @param CSS_classname the class name
	 * @param CSS_style the style
	 * @param innerHTMLText the inner html content
	 */
	public void html_appendBaseElement(String tag, String CSS_classname, String CSS_style, String innerHTMLText);
	
}
