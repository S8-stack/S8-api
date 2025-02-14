package com.s8.api.flow.table.requests;



/**
 * 
 * A Request object to create a table
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class CreateTableS8Request {
	
	
	/**
	 * the table id
	 */
	public final String tableId;
	
	
	/**
	 * true if hardware persistency is required immediatley afterwards.
	 */
	public final boolean isSaveImmediatelyRequired;

	
	
	/**
	 * The main constructor
	 * @param tableId the table id 
	 * @param isSaveImmediatelyRequired true if hardware persistenyc is required immediately after
	 */
	public CreateTableS8Request(String tableId, boolean isSaveImmediatelyRequired) {
		super();
		this.tableId = tableId;
		this.isSaveImmediatelyRequired = isSaveImmediatelyRequired;
	}
	
	
	/**
	 * The status of the response
	 */
	public enum Status {
		
		/** Request failed because a table with the same id already exists */
		TABLE_ALREADY_EXISTS,
		
		/** Request terminated successfully */
		OK;
	}
	
	
	/**
	 * Callback method upon successful request processing
	 * @param status the response status
	 */
	public abstract void onSucceed(Status status);

	
	/**
	 * Callback method upon failed request processing
	 * @param exception the exception raised
	 */
	public abstract void onFailed(Exception exception);

	

}
