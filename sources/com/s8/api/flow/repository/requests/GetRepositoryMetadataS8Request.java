package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.S8RepositoryMetadata;

/**
 * 
 * A Request object to get repository metadata
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class GetRepositoryMetadataS8Request {
	
	
	public final String address;
	
	/**
	 * 
	 * @param address
	 */
	public GetRepositoryMetadataS8Request(String address) {
		super();
		this.address = address;
	}
	
	public enum Status {
		OK,
		UNKNOWN_REPOSITORY;
	}
	
	
	/**
	 * 
	 * Callback method run upon successful request execution.
	 * 
	 * @param status the status returned
	 * @param metadata the data returned
	 */
	public abstract void onSucceed(Status status, S8RepositoryMetadata metadata);
	
	/**
	 * 
	 * On error callback method
	 * 
	 * @param exception the exception raised during exception
	 */
	public abstract void onFailed(Exception exception);
	
}
