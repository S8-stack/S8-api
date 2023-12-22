package com.s8.api.flow.table.requests;

import com.s8.api.flow.table.objects.RowS8Object;


/**
 * 
 */
public abstract class GetRowS8Request {
	
	
	public final String tableId;
	
	/**
	 * id
	 */
	public final String rowKey;
	
	
	/**
	 * 
	 * @param id
	 */
	public GetRowS8Request(String tableId, String rowKey) {
		super();
		this.tableId = tableId;
		this.rowKey = rowKey;
	}


	public enum Status {
		TABLE_DOES_NOT_EXIST,
		OK;
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
