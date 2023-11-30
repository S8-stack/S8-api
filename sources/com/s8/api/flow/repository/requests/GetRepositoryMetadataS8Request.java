package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.S8RepositoryMetadata;

/**
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
	 * @param status
	 * @param metadata
	 */
	public abstract void onSucceed(Status status, S8RepositoryMetadata metadata);
	
	/**
	 * 
	 * @param errorMessage
	 */
	public abstract void onFailed(Exception exception);
	
}
