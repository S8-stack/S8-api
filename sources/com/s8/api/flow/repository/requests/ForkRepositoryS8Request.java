package com.s8.api.flow.repository.requests;


/**
 * 
 * 
 * A Request object to fork repository.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public abstract class ForkRepositoryS8Request {
	
	/**
	 * The address of the origin repository
	 */
	public final String originRepoAddress;
	
	
	/**
	 * the origin branch id
	 */
	public final String originBranchId;
	
	
	/**
	 * The origin branch version
	 */
	public final long originBranchVersion;
	
	
	/**
	 * The target repository address
	 */
	public final String targetRepositoryAddress;
	
	
	/**
	 * The target repository name
	 */
	public final String targetRepositoryName;

	
	/**
	 * The target repository info
	 */
	public final String targetRepositoryInfo;
	
	
	
	/**
	 * The response status
	 */
	public enum Status {
		
		/** Successul request */
		SUCCESSFULLY_FORKED,
		
		/** Origin repository does not exist */
		ORIGIN_REPOSITORY_DOES_NOT_EXIST,
		
		/** Target rpository address creates a conflict */
		TARGET_REPO_ADDRESS_CONFLICT,
		
		/** Cannot find orgin branch */
		NO_SUCH_ORIGIN_BRANCH;
	}
	
	
	
	
	/**
	 * Main constructor 
	 * @param originRepoAddress the orgin repository address
	 * @param originBranchId the origin branch id
	 * @param originBranchVersion the origin branch version
	 * @param targetRepositoryAddress the target repository address
	 * @param targetRepositoryName the target repository name
	 * @param targetRepositoryInfo the target repository info
	 */
	public ForkRepositoryS8Request(
			String originRepoAddress, String originBranchId, long originBranchVersion,
			String targetRepositoryAddress,
			String targetRepositoryName,
			String targetRepositoryInfo) {
		super();
		
		this.originRepoAddress = originRepoAddress;
		this.originBranchId = originBranchId;
		this.originBranchVersion = originBranchVersion;
		
		this.targetRepositoryAddress = targetRepositoryAddress;
		this.targetRepositoryName = targetRepositoryName;
		this.targetRepositoryInfo = targetRepositoryInfo;
	}


	
	/**
	 * Callback method run upon successful request execution.
	 * 
	 * @param status the status returned
	 * @param version the verion returned
	 */
	public abstract void onResponded(Status status, long version);
	
	
	/**
	 * Callback method run upon failed request execution.
	 * 
	 * @param exception the exception raised
	 */
	public abstract void onFailed(Exception exception);
	
	
	
}
