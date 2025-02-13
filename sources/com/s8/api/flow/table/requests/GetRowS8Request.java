package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;


/**
 * 
 * A Request object to get a row in a specific table
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class GetRowS8Request {
	
	
	/**
	 * table id
	 */
	public final String tableId;
	
	/**
	 * row key
	 */
	public final String rowKey;
	
	
	/**
	 * Main constructor
	 * @param tableId the id of the table
	 * @param rowKey the key of the row
	 */
	public GetRowS8Request(String tableId, String rowKey) {
		super();
		this.tableId = tableId;
		this.rowKey = rowKey;
	}


	/**
	 * Response status
	 */
	public enum Status {
		
		/** Table with given id cannot be found */
		TABLE_DOES_NOT_EXIST,

		/** Request is successful */
		OK;
	}
	
	
	/**
	 * Callback method run upon request successful processing
	 * @param status the response status
	 * @param record the response value
	 */
	public abstract void onSucceed(Status status, RowS8Object record);

	
	/**
	 * Callback method run upon request failed processing
	 * @param exception the exception raised
	 */
	public abstract void onFailed(Exception exception);

}
