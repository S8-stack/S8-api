package com.s8.api.web.functions.objects;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.NeFunction;

/**
 * 
 * @author pierreconvert
 *
 */
@FunctionalInterface
public interface ObjectNeFunction<T extends S8WebObject> extends NeFunction {

	
	/**
	 * 
	 * @param arg
	 */
	public abstract void run(S8AsyncFlow flow, T arg);
	
	
}
