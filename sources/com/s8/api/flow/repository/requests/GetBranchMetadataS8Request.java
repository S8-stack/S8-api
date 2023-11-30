package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.S8BranchMetadata;

/**
 * 
 */
public abstract class GetBranchMetadataS8Request {
	
	
	public final String repositoryAddress;
	
	
	public final String branchId;
	
	
	/**
	 * 
	 * @param address
	 */
	public GetBranchMetadataS8Request(String repositoryAddress, String branchId) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
	}
	
	public enum Status {
		OK,
		UNKNOWN_REPOSITORY,
		NO_SUCH_BRANCH;
	}
	
	
	/**
	 * 
	 * @param status
	 * @param metadata
	 */
	public abstract void onSucceed(Status status, S8BranchMetadata metadata);
	
	/**
	 * 
	 * @param errorMessage
	 */
	public abstract void onFailed(Exception exception);
	
}
