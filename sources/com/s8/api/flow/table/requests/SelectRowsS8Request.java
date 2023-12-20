package com.s8.api.flow.table.requests;

import java.util.List;

import com.s8.api.flow.table.objects.RowS8Object;
import com.s8.api.flow.table.objects.S8Filter;

/**
 * 
 * @author pierreconvert
 *
 */
public abstract class SelectRowsS8Request<T extends RowS8Object> {
	
	
	public final String tableId;
	
	public final int maxNbOfResults;
	
	public final S8Filter<T> filter;
	

	
	
	
	/**
	 * 
	 * @param tableId
	 * @param filter
	 * @param maxNbOfResults -1 for unlimited
	 */
	public SelectRowsS8Request(String tableId, S8Filter<T> filter, int maxNbOfResults) {
		super();
		this.tableId = tableId;
		this.filter = filter;
		this.maxNbOfResults = maxNbOfResults;
	}
	
	
	public enum Status {
		TABLE_DOES_NOT_EXIST,
		OK;
	}

	
	/**
	 * 
	 * @param objects
	 */
	public abstract void onSucceed(Status status, List<T> objects);
	
	
	/**
	 * 
	 * @param exception
	 */
	public abstract void onFailed(Exception exception);
	
}
