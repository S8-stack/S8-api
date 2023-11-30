package com.s8.api.flow.space.requests;


/**
 * 
 */
public abstract class AccessSpaceS8Request {
	
	
	/**
	 * 
	 */
	public final String spaceId;
	
	
	public final boolean writeChangesImmediatelyAfter;
	

	public AccessSpaceS8Request(String spaceId, boolean writeChangesImmediatelyAfter) {
		super();
		this.spaceId = spaceId;
		this.writeChangesImmediatelyAfter = writeChangesImmediatelyAfter;
	}


	public enum Status {
		OK,
		INVALID_SPACE_ID,
		SPACE_DOES_NOT_EXIST
	}
	
	
	/**
	 * 
	 * @param status
	 * @param objects
	 */
	public abstract void onAccessed(Status status, Object[] objects);
	
	
	/**
	 * 
	 * @param message
	 */
	public abstract void onFailed(Exception exception);


}
