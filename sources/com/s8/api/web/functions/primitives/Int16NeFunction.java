package com.s8.api.web.functions.primitives;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */

@FunctionalInterface
public interface Int16NeFunction extends NeFunction {
	


	/**
	 * 
	 * @param flow
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, int arg);
}
