package com.s8.api;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.S8WebFront;

/**
 * 
 */
public interface S8BootFunc {

	
	/**
	 * 
	 * @param front
	 * @param flow
	 * @throws Exception
	 */
	public void boot(S8WebFront front, S8AsyncFlow flow) throws Exception;


}
