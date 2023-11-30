package com.s8.api.flow.repository.requests;

/**
 * 
 */
public abstract class ForkBranchS8Request {
	
	
	/**
	 * 
	 */
	public final String repositoryAddress;
	
	
	/**
	 * 
	 */
	public final String originBranchId;
	
	/**
	 * 
	 */
	public final long originBranchVersion;
	
	/**
	 * 
	 */
	public final String targetBranchId;
	
	
	/**
	 * 
	 */
	public enum Status {
		SUCCESSFULLY_FORKED,
		REPOSITORY_DOES_NOT_EXIST,
		NO_SUCH_ORIGIN_BRANCH,
		TARGET_BRANCH_ID_CONFLICT;
	}
	
	
	
	
	
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
	 * @param status
	 * @param version
	 */
	public abstract void onResponded(Status status, long version);
	
	
	/**
	 * 
	 */
	public abstract void onFailed(Exception exception);
	
	
	
}
