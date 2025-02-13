package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.S8BranchMetadata;


/**
 * 
 * 
 * A Request object to get the metadata of a branch of a repository.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public abstract class GetBranchMetadataS8Request {
	
	
	
	/**
	 * The address of the repository
	 */
	public final String repositoryAddress;
	
	/**
	 * the branch id
	 */
	public final String branchId;
	
	
	
	/**
	 * Main constructor.
	 * @param repositoryAddress the repository address
	 * @param branchId the branch id
	 */
	public GetBranchMetadataS8Request(String repositoryAddress, String branchId) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
	}
	
	
	/** Response status */
	public enum Status {
		
		/** Request has been successfuly executed */
		OK,
		
		/** Unknow repository*/
		UNKNOWN_REPOSITORY,
		
		/** No such branch */
		NO_SUCH_BRANCH;
	}
	
	
	/**
	 * 
	 * Callback method run upon successful request execution.
	 * 
	 * @param status the status returned
	 * @param metadata the data returned
	 */
	public abstract void onSucceed(Status status, S8BranchMetadata metadata);
	
	/**
	 * 
	 * Callback method run upon failed request execution.
	 * 
	 * @param exception the exception raised during request execution
	 */
	public abstract void onFailed(Exception exception);
	
}
