package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.RepoS8Object;

/**
 * 
 */
public abstract class CreateRepositoryS8Request {

	
	/**
	 * 
	 */
	public final String repositoryName;
	
	/**
	 * 
	 */
	public final String repositoryAddress;
	
	/**
	 * 
	 */
	public final String repositoryInfo;
	
	/**
	 * 
	 */
	public final String mainBranchName;
	
	/**
	 * 
	 */
	public final RepoS8Object[] objects;
	
	/**
	 * 
	 */
	public final String initialCommitComment;
	
	
	public CreateRepositoryS8Request(
			String repositoryName, 
			String repositoryAddress, 
			String repositoryInfo,
			String mainBranchName, 
			RepoS8Object[] objects, 
			String initialCommitComment) {
		super();
		this.repositoryName = repositoryName;
		this.repositoryAddress = repositoryAddress;
		this.repositoryInfo = repositoryInfo;
		this.mainBranchName = mainBranchName;
		this.objects = objects;
		this.initialCommitComment = initialCommitComment;
	}


	
	public enum Status {
		OK,
		IS_ADDRESS_CONFLICTING;
	}
	
	
	/**
	 * 
	 * @param status
	 * @param version
	 */
	public abstract void onResponse(Status status, long version);

	/**
	 * 
	 * @param message
	 */
	public abstract void onFailed(Exception exception);
	
}
