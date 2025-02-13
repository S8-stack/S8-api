package com.s8.api.flow.repository.requests;

import com.s8.api.flow.repository.objects.RepoS8Object;

/**
 * 
 * A Request object to create a new repository.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public abstract class CreateRepositoryS8Request {

	
	/**
	 * the repository name
	 */
	public final String repositoryName;
	
	/**
	 * the repository address
	 */
	public final String repositoryAddress;
	
	/**
	 * the repository info
	 */
	public final String repositoryInfo;
	
	/**
	 * the main branch name
	 */
	public final String mainBranchName;
	
	/**
	 * the objects
	 */
	public final RepoS8Object[] objects;
	
	/**
	 * the initail commit comment
	 */
	public final String initialCommitComment;
	
	
	public boolean isResourceSaved = false;
	
	public boolean isOverrideEnabled = false;
	
	
	
	/**
	 * Main constructor
	 *  
	 * @param repositoryName the name of the repository
	 * @param repositoryAddress the address of the repository
	 * @param repositoryInfo the repository info
	 * @param mainBranchName the main branch name
	 * @param objects objects for the initial commit
	 * @param initialCommitComment the initial commit comment
	 */
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



	/**
	 * Status for the response
	 */
	public enum Status {
		
		/** The request has been successfully run */
		OK,
		
		/** Address if causing conflicts */
		IS_ADDRESS_CONFLICTING;
	}
	
	
	
	/**
	 * Callback method run upon successful request execution
	 * 
	 * @param status the response status
	 * @param version the version returned
	 */
	public abstract void onResponse(Status status, long version);

	
	
	/**
	 * Callback method run upon failed request execution
	 * 
	 * @param exception the execption raised during the request processing
	 */
	public abstract void onFailed(Exception exception);
	
}
