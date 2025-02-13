package com.s8.api.flow.table.requests;

import java.util.List;

import com.s8.api.flow.table.objects.RowS8Object;
import com.s8.api.flow.table.objects.S8Filter;

/**
 * 
 * A Request object to select rows.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 * @param <T> The type of the row objects.
 *
 */
public abstract class SelectRowsS8Request<T extends RowS8Object> {
	
	
	/**
	 * table id
	 */
	public final String tableId;
	
	
	/**
	 * max number of results
	 */
	public final int maxNbOfResults;
	
	
	/**
	 * filter to be used
	 */
	public final S8Filter<T> filter;
	

	
	
	
	/**
	 * Main constructor
	 * @param tableId the table id
	 * @param filter the filter to use
	 * @param maxNbOfResults the max number of results to be caught (-1 for unlimited)
	 */
	public SelectRowsS8Request(String tableId, S8Filter<T> filter, int maxNbOfResults) {
		super();
		this.tableId = tableId;
		this.filter = filter;
		this.maxNbOfResults = maxNbOfResults;
	}
	
	
	/**
	 * Response status
	 */
	public enum Status {
		
		/** the table does not exist */
		TABLE_DOES_NOT_EXIST,
		
		/** Request performed successfully */
		OK;
	}

	
	/**
	 * Callback method upon successful request processing.
	 * @param status the response status
	 * @param objects the response retrieved objects
	 */
	public abstract void onSucceed(Status status, List<T> objects);
	
	
	/**
	 * Callback method upon failed request processing.
	 * @param exception the exception raised
	 */
	public abstract void onFailed(Exception exception);
	
}
