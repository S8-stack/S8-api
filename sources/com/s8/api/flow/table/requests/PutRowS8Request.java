package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;


/**
 * 
 * A Request object to put a row in a specific table
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class PutRowS8Request {
	
	
	/**
	 * The table id
	 */
	public final String tableId;
	
	/**
	 * the row object
	 */
	public final RowS8Object row;
	
	/**
	 * true if overriding is allowed
	 */
	public final boolean isOverridingAllowed;
	
	/**
	 * true if hardware persistency is required before request processing termination
	 */
	public final boolean isImmediateHDWriteRequired;
	
	
	
	/**
	 * Main constructor 
	 * 
	 * @param tableId the id of the table
	 * @param row the row object to be inserted
	 * @param isOverridingAllowed true of overrides are allowed
	 * @param isImmediateHDWriteRequired true if hardware immediate persistency is required
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
	
	


	/**
	 * Response status for the request
	 */
	public enum Status {
		
		/** Request aborted because table does not exist */
		TABLE_DOES_NOT_EXIST,
		
		/** Request sucessfully terminated */
		OK,
		
		/** id conflict resulted in request failure */
		ID_CONFLICT;
	}
	
	
	/**
	 * Callback method upon successful request processing.
	 * @param status the status of the response
	 */
	public abstract void onSucceed(Status status);

	
	/**
	 * Callback method upon failed request processing.
	 * @param exception the exception raised
	 */
	public abstract void onError(Exception exception);

}
