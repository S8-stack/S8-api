package com.s8.api.flow.mail;

import java.io.IOException;

/**
 * 
 * Request Object to send a mail.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class SendMailS8Request {
	
	
	/**
	 * flag
	 */
	public final boolean isOutOfFlow;
	
	
	/**
	 * Main constructor
	 * @param isOutOfFlow flag
	 */
	public SendMailS8Request(boolean isOutOfFlow) {
		super();
		this.isOutOfFlow = isOutOfFlow;
	}

	
	/**
	 * Compose an email functional interface
	 * @param mail the mail builder
	 * @throws IOException exception
	 */
	public abstract void compose(S8MailBuilder mail) throws IOException;
	
	

	/** Response status */
	public enum Status {
		
		/** Successful sending */
		OK,
		
		/** Mail has been rejected by the outgoing server */
		MAIL_REJECTED_BY_OUTGOING_SERVER,
		
		/** Mail has been rejected by the incoming server */
		MAIL_REJECTED_BY_INCOMING_SERVER,

		/** Composing failed */
		INVALID_COMPOSING;
	}
	

	/**
	 * 
	 * Callback method run upon successful request execution.
	 * 
	 * @param status the status returned
	 * @param message the message returned by request execution process
	 */
	public abstract void onSent(Status status, String message);
	

	/**
	 * 
	 * Callback method run upon failed request execution.
	 * 
	 * @param exception the exception raised during the process
	 */
	public abstract void onFailed(Exception exception);
	
}
