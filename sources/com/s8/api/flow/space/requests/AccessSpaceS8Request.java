package com.s8.api.flow.space.requests;


/**
 * 
 * A Request Object to access a space.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 */
public abstract class AccessSpaceS8Request {
	
	
	/**
	 * The identifier of the space targeted by this request.
	 */
	public final String spaceId;
	
	
	/**
	 * True if immediate Disk writing is required
	 */
	public final boolean writeChangesImmediatelyAfter;
	

	
	/**
	 * Main constructor
	 * 
	 * @param spaceId the identifier of the space
	 * @param writeChangesImmediatelyAfter true if changes needs to be copied to hard drive immediately
	 */
	public AccessSpaceS8Request(String spaceId, boolean writeChangesImmediatelyAfter) {
		super();
		this.spaceId = spaceId;
		this.writeChangesImmediatelyAfter = writeChangesImmediatelyAfter;
	}


	/**
	 * The status of the response
	 */
	public enum Status {
		
		/** Eveyrthinf is fine */
		OK,
		
		/** the space id is invalid */
		INVALID_SPACE_ID,
		
		/** the space does not exist */
		SPACE_DOES_NOT_EXIST
	}
	
	
	/**
	 * Callback method upon successful completion of the request (check status to see if the request succeed).
	 * 
	 * @param status the status upon successful access
	 * @param objects the objects accessed wthat have been reached.
	 */
	public abstract void onAccessed(Status status, Object[] objects);
	
	

	/**
	 * Callback method upon failed execution of the request.
	 * 
	 * @param exception the exception raiseed upon accessing the space.
	 */
	public abstract void onFailed(Exception exception);


}
