package com.s8.api.objects.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.objects.web.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */
@FunctionalInterface
public interface UInt64ArrayNeFunction extends NeFunction {

	

	
	/**
	 * 
	 * @param flow
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, long[] arg);
	
}

