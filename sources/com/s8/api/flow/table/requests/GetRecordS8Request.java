package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;


/**
 * 
 */
public abstract class GetRecordS8Request {
	
	
	/**
	 * id
	 */
	public final String id;
	
	
	/**
	 * 
	 * @param id
	 */
	public GetRecordS8Request(String id) {
		super();
		this.id = id;
	}


	public enum Status {
		OK,
		NOT_FOUND;
	}
	
	
	/**
	 * 
	 * @param status
	 * @param record
	 */
	public abstract void onSucceed(Status status, RowS8Object record);

	
	/**
	 * 
	 * @param exception
	 */
	public abstract void onFailed(Exception exception);

}
