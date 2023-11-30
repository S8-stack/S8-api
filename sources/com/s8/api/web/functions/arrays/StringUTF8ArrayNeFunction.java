package com.s8.api.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */
@FunctionalInterface
public interface StringUTF8ArrayNeFunction extends NeFunction {

	/**
	 * 
	 * @param flow
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, String[] arg);
	
}
