package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.RepoS8Object;

/**
 * A Request object to commit a branch on a repository.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class CommitBranchS8Request {

	
	/**
	 * The request target repository address
	 */
	public final String repositoryAddress;
	
	/**
	 * The request target branch id
	 */
	public final String branchId;
	
	
	/**
	 * The request committed objects
	 */
	public final RepoS8Object[] objects;
	
	/**
	 * The authod of the commit
	 */
	public final String author;
	
	/**
	 * The comment along the commit
	 */
	public final String comment;
	
	
	
	/**
	 * Main constructor
	 * 
	 * @param repositoryAddress the repository address
	 * @param branchId the branch id
	 * @param objects the objects
	 * @param author the author
	 * @param comment the comment
	 */
	public CommitBranchS8Request(String repositoryAddress, String branchId, RepoS8Object[] objects, String author,
			String comment) {
		super();
		this.repositoryAddress = repositoryAddress;
		this.branchId = branchId;
		this.objects = objects;
		this.author = author;
		this.comment = comment;
	}
	
	
	
	/**
	 * Reponses status
	 */
	public enum Status {
		
		/** ok */
		OK,
		
		/** Repository cannot be found for the give address */
		REPOSITORY_NOT_FOUND,
		
		/** Branch cannot be found for the given id */
		NO_SUCH_BRANCH,
		
		/** Request is invalid */
		INVALID_REQUEST;
	}
	
	
	/**
	 * Callback method run upon successful request execution
	 * 
	 * @param status the response status
	 * @param version the requested version
	 */
	public abstract void onResponse(Status status, long version);
	

	/**
	 * Callback method run upon failed request execution
	 * 
	 * @param exception the exception raised during processing
	 */
	public abstract void onFailed(Exception exception);
	
}
