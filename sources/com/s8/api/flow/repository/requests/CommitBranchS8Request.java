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
