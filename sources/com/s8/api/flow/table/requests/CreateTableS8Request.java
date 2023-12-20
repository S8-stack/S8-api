package com.s8.api.flow.table.requests;

public abstract class CreateTableS8Request {
	
	
	/**
	 * 
	 */
	public final String tableId;
	
	
	public final boolean isSaveImmediatelyRequired;

	
	public CreateTableS8Request(String tableId, boolean isSaveImmediatelyRequired) {
		super();
		this.tableId = tableId;
		this.isSaveImmediatelyRequired = isSaveImmediatelyRequired;
	}
	
	
	public enum Status {
		TABLE_ALREADY_EXISTS,
		OK;
	}
	
	public abstract void onSucceed(Status status);

	
	public abstract void onFailed(Exception exception);

	

}
