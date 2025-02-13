package com.s8.api.flow;


/**
 * An abstract representation of a user.
 *
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 */
public interface S8User {

	
	/**
	 * ID of the user
	 * @return the user name
	 */
	public String getUsername();
	
	
	
	/**
	 * Return the user password
	 * @return the user password
	 */
	public String getPassword();
	

	
	/**
	 * the personal space id
	 * @return the user personal space id
	 */
	public String getPersonalSpaceId();
	
}
