package com.s8.api.flow.repository.requests;

import com.s8.api.flow.S8AsyncFlow;


/**
 * 
 * 
 * A Request object to clone a branch of a repository.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public abstract class CloneBranchS8Request {

	/**
	 * the repository address
	 */
	public final String repositoryAddress;
	
	
	/**
	 * the branch id
	 */
	public final String branchId;
	
	
	/**
	 * the targeted version
	 */
	public final long version;
	
	
	/**
	 * Main constructor 
	 * @param repositoryAddress the repository address
	 * @param branchId the branch id
	 * @param version the version of the branch from which cloning must be done
	 */
	public CloneBranchS8Request(String repositoryAddress, String branchId, long version) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.version = version;
	}
	
	
	/**
	 * Secondary constructor with default value
	 * @param repositoryAddress the target repository id
	 * @param branchId the target branch id
	 */
	public CloneBranchS8Request(String repositoryAddress, String branchId) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.version = S8AsyncFlow.HEAD_VERSION;
	}


	/**
	 * Response Status
	 */
	public enum Status {
		
		/** Request terminates successfully */
		OK,
		
		/** Repository cannot be found for given address */
		REPOSITORY_NOT_FOUND,

		/** Branch cannot be found for the given branch id in the targeted repository */
		NO_SUCH_BRANCH,
		
		/** Version cannot be found for the given version value of the targeted branch of the targeted repository */
		NO_SUCH_VERSION,
		
		/** version format is invalid */
		INVALID_VERSION;
	}
	
	
	/**
	 * Callback run upon successful request execution
	 * 
	 * 
	 * @param status Request response status
	 * @param objects The cloned objects
	 */
	public abstract void onResponse(Status status, Object[] objects);
	
	
	/**
	 * Callback run upon failed request execution
	 * 
	 * @param exception the raised exception
	 */
	public abstract void onError(Exception exception);
}
