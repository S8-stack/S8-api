package com.s8.api.flow.repository.objects;

import java.util.function.BiConsumer;

public interface S8RepositoryMetadata {

	
	/**
	 * 
	 * @return
	 */
	public String getName();
	
	
	/**
	 * 
	 * @return
	 */
	public String getAddress();
	
	/**
	 * 
	 * @return
	 */
	public long getCreationDate();
	
	/**
	 * 
	 * @return
	 */
	public String getOwner();
	
	/**
	 * 
	 * @return
	 */
	public String getInfo();

	/**
	 * 
	 * @return
	 */
	public int getNbBranches();
	
	
	/**
	 * 
	 * @param consumer
	 */
	public void crawlBranches(BiConsumer<String, S8BranchMetadata> consumer);
	
}
