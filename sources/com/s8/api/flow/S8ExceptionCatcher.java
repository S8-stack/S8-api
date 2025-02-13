package com.s8.api.flow;


/**
 * S8ExceptionCatcher is the functional interface for catching exception
 */
@FunctionalInterface
public interface S8ExceptionCatcher {

	
	/**
	 * the function method
	 * @param e the exception caught
	 */
	public void run(Exception e);
}
