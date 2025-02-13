package com.s8.api.flow.repository.objects;

/**
 * 
 * S8BranchMetadata represents the metadata of a branch.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public interface S8BranchMetadata {

	
	/**
	 * Get name
	 * @return the branch name
	 */
	public String getName();


	/**
	 * Get info
	 * @return the branch info
	 */
	public String getInfo();


	/**
	 * Get head version
	 * @return the head version
	 */
	public long getHeadVersion();


	/**
	 * Origin of branch
	 * @return the forked branch id
	 */
	public String getForkedBranchId();
	
	/**
	 * Get the forked branch version
	 * @return the branch version
	 */
	public long getForkedBranchVersion();


	/**
	 * Get the owner
	 * @return the owner
	 */
	public String getOwner();
}
