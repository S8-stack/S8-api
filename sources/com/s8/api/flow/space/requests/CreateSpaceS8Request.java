package com.s8.api.flow.space.requests;

import com.s8.api.flow.space.objects.SpaceS8Object;


/**
 * 
 * A Request Object to Create a space
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 */
public abstract class CreateSpaceS8Request {

	
	/**
	 * the id of the space
	 */
	public final String spaceId;
	

	/**
	 * the exposure of the space
	 */
	public final SpaceS8Object[] exposure;



	/**
	 * Main constructor
	 * 
	 * @param spaceId
	 * @param exposure
	 */
	public CreateSpaceS8Request(String spaceId, SpaceS8Object[] exposure) {
		super();
		this.spaceId = spaceId;
		this.exposure = exposure;
	}

	
	/**
	 * Status of the response
	 */
	public enum Status {
		
		/** Request has terminated successfully */
		OK,
		
		/** space id is invalid */
		INVALID_SPACE_ID,
		
		/** space id would cause conflicts */
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
