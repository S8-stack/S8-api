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
	 * the repository address
	 */
	public final String repositoryAddress;
	
	
	
	
	/**
	 * Main constructor 
	 * 
	 * @param repositoryAddress the address of the repository
	 */
	public DeleteRepositoryS8Request(String repositoryAddress) {
		super();
		this.repositoryAddress = repositoryAddress;
	}


	
	/**
	 * Response status
	 */
	public enum Status {
		
		/** Everything is fine */
		OK,
		
		/** nothing to delete */
		NOTHING_TO_DELETE;
	}
	
	
	/**
	 * Callback run upon successful request execution
	 * 
	 * @param status the status of the response
	 * @param version the reported version
	 */
	public abstract void onResponse(Status status, long version);

	/**
	 * Callback run upon failed request execution
	 * 
	 * @param exception the exception raised during the request processing
	 */
	public abstract void onFailed(Exception exception);
	
}
