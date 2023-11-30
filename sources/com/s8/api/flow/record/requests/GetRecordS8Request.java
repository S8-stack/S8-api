package com.s8.api.flow.record.requests;

import com.s8.api.flow.record.objects.RecordS8Object;

public abstract class GetRecordS8Request {
	
	
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
	
	public abstract void onSucceed(Status status, RecordS8Object record);

	
	public abstract void onFailed(Exception exception);

}
