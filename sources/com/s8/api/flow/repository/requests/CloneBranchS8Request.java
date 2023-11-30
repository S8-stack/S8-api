package com.s8.api.flow.repository.requests;

import com.s8.api.flow.S8AsyncFlow;

public abstract class CloneBranchS8Request {

	/**
	 * 
	 */
	public final String repositoryAddress;
	
	
	/**
	 * 
	 */
	public final String branchId;
	
	
	/**
	 * 
	 */
	public final long version;
	
	
	/**
	 * 
	 * @param repositoryAddress
	 * @param branchId
	 * @param version
	 */
	public CloneBranchS8Request(String repositoryAddress, String branchId, long version) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.version = version;
	}
	
	
	/**
	 * 
	 * @param repositoryAddress
	 * @param branchId
	 */
	public CloneBranchS8Request(String repositoryAddress, String branchId) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.version = S8AsyncFlow.HEAD_VERSION;
	}


	public enum Status {
		OK,
		REPOSITORY_NOT_FOUND,
		NO_SUCH_BRANCH,
		NO_SUCH_VERSION,
		INVALID_VERSION;
	}
	
	
	/**
	 * 
	 * @param status
	 * @param objects
	 */
	public abstract void onResponse(Status status, Object[] objects);
	
	
	/**
	 * 
	 * @param message
	 */
	public abstract void onError(Exception exception);
}
