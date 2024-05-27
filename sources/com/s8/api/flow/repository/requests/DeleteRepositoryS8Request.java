package com.s8.api.flow.repository.requests;

/**
 * 
 */
public abstract class DeleteRepositoryS8Request {

	
	/**
	 * 
	 */
	public final String repositoryAddress;
	
	
	
	
	public DeleteRepositoryS8Request(String repositoryAddress) {
		super();
		this.repositoryAddress = repositoryAddress;
	}


	
	public enum Status {
		OK,
		NOTHING_TO_DELETE;
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
