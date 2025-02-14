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
	
	
	/**
	 * the address of the target repository
	 */
	public final String address;
	
	/**
	 * Main constructor
	 * @param address target repo
	 */
	public GetRepositoryMetadataS8Request(String address) {
		super();
		this.address = address;
	}
	
	
	/** Status */
	public enum Status {
		
		/** OK : request successfully processed */
		OK,
		
		/** Unknow repository */
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
