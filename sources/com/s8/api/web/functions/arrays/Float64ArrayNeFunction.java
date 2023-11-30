package com.s8.api.web.functions.arrays;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */
@FunctionalInterface
public interface Float64ArrayNeFunction extends NeFunction {

	/**
	 * 
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, double[] arg);
}
