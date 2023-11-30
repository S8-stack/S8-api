package com.s8.api.flow.space.requests;

import com.s8.api.flow.space.objects.SpaceS8Object;

/**
 * 
 */
public abstract class ExposeSpaceS8Request {
	
	
	public final String spaceId;
	
	public final SpaceS8Object[] exposure;
	
	public final boolean saveImmediatelyAfter;
	
	
	
	
	public ExposeSpaceS8Request(String spaceId, SpaceS8Object[] exposure, boolean saveImmediatelyAfter) {
		super();
		this.spaceId = spaceId;
		this.exposure = exposure;
		this.saveImmediatelyAfter = saveImmediatelyAfter;
	}
	
	
	public enum Status {
		OK,
		NOT_FOUND;
	}
	
	
	/**
	 * 
	 * @param status
	 * @param version
	 */
	public abstract void onResponse(Status status, long version);
	
	
	/**
	 * 
	 * @param message
	 */
	public abstract void onFailed(Exception message);

}
