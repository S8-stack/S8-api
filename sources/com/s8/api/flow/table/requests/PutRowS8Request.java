package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;

public abstract class PutRowS8Request {
	
	
	public final String tableId;
	
	public final RowS8Object row;
	
	public final boolean isOverridingAllowed;
	
	public final boolean isImmediateHDWriteRequired;
	
	/**
	 * 
	 * @param id
	 */
	public PutRowS8Request(
			String tableId,
			RowS8Object row,
			boolean isOverridingAllowed, 
			boolean isImmediateHDWriteRequired) {
		super();
		this.tableId = tableId;
		this.row = row;
		this.isOverridingAllowed = isOverridingAllowed;
		this.isImmediateHDWriteRequired = isImmediateHDWriteRequired;
	}
	
	


	public enum Status {
		TABLE_DOES_NOT_EXIST,
		OK,
		ID_CONFLICT;
	}
	
	public abstract void onSucceed(Status status);

	
	public abstract void onError(Exception exception);

}
