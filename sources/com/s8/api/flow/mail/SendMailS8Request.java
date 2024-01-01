package com.s8.api.flow.mail;

import java.io.IOException;

/**
 * 
 */
public abstract class SendMailS8Request {
	
	
	public final boolean isOutOfFlow;
	
	public SendMailS8Request(boolean isOutOfFlow) {
		super();
		this.isOutOfFlow = isOutOfFlow;
	}

	
	/**
	 * 
	 * @param mail
	 * @throws IOException
	 */
	public abstract void compose(S8Mail mail) throws IOException;
	
	

	public enum Status {
		OK,
		MAIL_REJECTED_BY_OUTGOING_SERVER,
		MAIL_REJECTED_BY_INCOMING_SERVER,
		INVALID_COMPOSING;
	}
	

	/**
	 * 
	 * @param status
	 * @param version
	 */
	public abstract void onSent(Status status, String message);
	

	/**
	 * 
	 * @param message
	 */
	public abstract void onFailed(Exception exception);
	
}
