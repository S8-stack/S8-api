package com.s8.api.flow.repository.requests;

/**
 * 
 * A Request method to fork a branch of a repository
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 */
public abstract class ForkBranchS8Request {
	
	
	/**
	 * the repository address
	 */
	public final String repositoryAddress;
	
	
	/**
	 * the origin branch id
	 */
	public final String originBranchId;
	
	/**
	 * the origin branch version
	 */
	public final long originBranchVersion;
	
	/**
	 * the target brnach id
	 */
	public final String targetBranchId;
	
	
	/**
	 * Possible output status
	 */
	public enum Status {
		
		/** Request succeed */
		SUCCESSFULLY_FORKED,
		
		/** Request failed because Repository does not exist */
		REPOSITORY_DOES_NOT_EXIST,

		/** Request failed because there is no such origin branch */
		NO_SUCH_ORIGIN_BRANCH,
		
		/** Request failed because target id is causing conflict
		 * (for instance, because there is already a branch with this id) */
		TARGET_BRANCH_ID_CONFLICT;
	}
	

	
	
	/**
	 * Main constructor 
	 * @param repositoryAddress the address of the repository
	 * @param originBranchId the id of the origin branch
	 * @param originBranchVersion the version of the origin branch
	 * @param targetBranchId the target barnch id
	 */
	public ForkBranchS8Request(String repositoryAddress, String originBranchId, long originBranchVersion,
			String targetBranchId) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.originBranchId = originBranchId;
		this.originBranchVersion = originBranchVersion;
		this.targetBranchId = targetBranchId;
	}


	
	/**
	 * 
	 * Callback method run upon successful request execution
	 * 
	 * @param status the status returned
	 * @param version the version returned
	 */
	public abstract void onResponded(Status status, long version);
	
	
	/**
	 * 
	 * Callback method run upon failed request execution
	 * 
	 * @param exception the exception raised
	 * 
	 */
	public abstract void onFailed(Exception exception);
	
	
	
}
