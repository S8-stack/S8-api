package com.s8.api.flow.repository.requests;



/**
 * 
 * 
 * A Request object to delete a repository.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public abstract class DeleteRepositoryS8Request {

	
	/**
	 * 
	 */
	public final String repositoryAddress;
	
	
	
	
	public DeleteRepositoryS8Request(String repositoryAddress) {
		super();
		this.repositoryAddress = repositoryAddress;
	}


	
	public enum Status {
		OK,
		NOTHING_TO_DELETE;
	}
	
	
	/**
	 * Callback run upon successful request execution
	 * 
	 * @param status
	 * @param version
	 */
	public abstract void onResponse(Status status, long version);

	/**
	 * Callback run upon failed request execution
	 * 
	 * @param exception the exception raised during the request processing
	 */
	public abstract void onFailed(Exception exception);
	
}
