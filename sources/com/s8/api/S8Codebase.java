package com.s8.api;




/**
 * 
 * @author pierreconvert
 *
 */
public class S8Codebase {


	/**
	 * 
	 */
	public final Class<?>[] tableClasses;

	
	/**
	 * 
	 */
	public final Class<?>[] spaceClasses;
	

	
	/**
	 * 
	 */
	public final Class<?>[] repoClasses;


	/**
	 * 
	 * @param userType
	 * @param spaceTypes
	 * @param repoTypes
	 * @throws BeBuildException
	 * @throws S8BuildException
	 * @throws NdBuildException
	 */
	public S8Codebase(
			Class<?>[] rowClasses, 
			Class<?>[] spaceClasses,
			Class<?>[] repoClasses) {
		super();
		this.tableClasses = rowClasses;
		this.spaceClasses = spaceClasses;
		this.repoClasses = repoClasses;
	}

}
