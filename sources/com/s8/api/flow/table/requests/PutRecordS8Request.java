package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;

public abstract class PutRecordS8Request {
	
	
	public final RowS8Object record;
	
	public final boolean isOverridingAllowed;
	
	public final boolean isImmediateHDWriteRequired;
	
	/**
	 * 
	 * @param id
	 */
	public PutRecordS8Request(RowS8Object record,
			boolean isOverridingAllowed, 
			boolean isImmediateHDWriteRequired) {
		super();
		this.record = record;
		this.isOverridingAllowed = isOverridingAllowed;
		this.isImmediateHDWriteRequired = isImmediateHDWriteRequired;
	}
	
	


	public enum Status {
		OK,
		ID_CONFLICT;
	}
	
	public abstract void onResponse(Status status);

	
	public abstract void onError(Exception exception);

}
