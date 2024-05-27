package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.RepoS8Object;

/**
 * 
 */
public abstract class CommitBranchS8Request {

	public final String repositoryAddress;
	
	public final String branchId;
	
	public final RepoS8Object[] objects;
	
	public final String author;
	
	public final String comment;
	
	
	
	public CommitBranchS8Request(String repositoryAddress, String branchId, RepoS8Object[] objects, String author,
			String comment) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.objects = objects;
		this.author = author;
		this.comment = comment;
	}
	
	
	
	public enum Status {
		OK,
		REPOSITORY_NOT_FOUND,
		NO_SUCH_BRANCH,
		INVALID_REQUEST;
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
