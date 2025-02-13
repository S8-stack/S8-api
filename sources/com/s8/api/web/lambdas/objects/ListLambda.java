package com.s8.api.web.lambdas.objects;

import java.util.List;

import com.s8.api.web.S8WebObject;

/**
 * 
 * 
 * A Web lambda on an {@link S8WebObject}[] argument (from network).
 * 
 * @author Pierre Convert Copyright (C) 2025, Pierre Convert. All rights
 *         reserved.
 *
 * @param <T> an {@link S8WebObject}
 */
@FunctionalInterface
public interface ListLambda<T extends S8WebObject> {

	/**
	 * The function method
	 * 
	 * @param arg the argurment passed from the front side
	 */
	public void operate(List<T> arg);
}
