package com.s8.api.flow.repository.objects;

import java.util.function.BiConsumer;


/**
 * 
 * 
 * A flat object with the repository metadata.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public interface S8RepositoryMetadata {

	
	/**
	 * Get the repository name
	 * @return the repo name
	 */
	public String getName();
	
	
	/**
	 * Get the repository address
	 * @return the repo address
	 */
	public String getAddress();
	
	/**
	 * Get the creation date
	 * @return date
	 */
	public long getCreationDate();
	
	/**
	 * Get the owner 
	 * @return owner
	 */
	public String getOwner();
	
	/**
	 * Get the repository info
	 * @return info
	 */
	public String getInfo();

	/**
	 * Get the number of branches
	 * @return branches
	 */
	public int getNbBranches();
	
	
	/**
	 * Crawl branches
	 * @param consumer consumer
	 */
	public void crawlBranches(BiConsumer<String, S8BranchMetadata> consumer);
	
}
