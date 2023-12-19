package com.s8.api.flow.table.requests;

import java.util.List;

import com.s8.api.flow.table.objects.RowS8Object;
import com.s8.api.flow.table.objects.S8Filter;

/**
 * 
 * @author pierreconvert
 *
 */
public abstract class SelectRecordsS8Request<T extends RowS8Object> {
	
	
	public final S8Filter<T> filter;
	

	
	/**
	 * 
	 * @param isSuccessful
	 * @param hasIOException
	 * @param user
	 */
	public SelectRecordsS8Request(S8Filter<T> filter) {
		super();
		this.filter = filter;
	}
	
	
	public enum Status {
		OK;
	}

	
	/**
	 * 
	 * @param objects
	 */
	public abstract void onResponse(List<T> objects);
	
	
	/**
	 * 
	 * @param exception
	 */
	public abstract void onError(Exception exception);
	
}
