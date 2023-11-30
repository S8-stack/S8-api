package com.s8.api.flow.repository.requests;

/**
 * 
 */
public abstract class ForkRepositoryS8Request {
	
	public final String originRepoAddress;
	
	public final String originBranchId;
	
	public final long originBranchVersion;
	
	public final String targetRepositoryAddress;
	
	public final String targetRepositoryName;

	public final String targetRepositoryInfo;
	
	
	public enum Status {
		SUCCESSFULLY_FORKED,
		ORIGIN_REPOSITORY_DOES_NOT_EXIST,
		TARGET_REPO_ADDRESS_CONFLICT,
		NO_SUCH_ORIGIN_BRANCH;
	}
	
	
	
	
	
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
