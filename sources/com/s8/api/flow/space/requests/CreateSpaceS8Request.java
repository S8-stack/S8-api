package com.s8.api.flow.space.requests;

import com.s8.api.flow.space.objects.SpaceS8Object;


/**
 * 
 */
public abstract class CreateSpaceS8Request {

	
	/**
	 * 
	 */
	public final String spaceId;
	

	/**
	 * 
	 */
	public final SpaceS8Object[] exposure;



	
	public CreateSpaceS8Request(String spaceId, SpaceS8Object[] exposure) {
		super();
		this.spaceId = spaceId;
		this.exposure = exposure;
	}

	public enum Status {
		OK,
		INVALID_SPACE_ID,
		SPACE_ID_CONFLICT;
	}

	
	/**
	 * 
	 */
	public abstract void onProcessed(Status status, long version);


	/**
	 * 
	 * @param exception
	 */
	public abstract void onFailed(Exception exception);

}
