package com.s8.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * Parameter annotation for the S8 Stack.
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface S8Param {

	
	/**
	 * Give the name of the paramter
	 * @return the name this field will be bound to
	 */
	public String name();
	
	
	/**
	 * Give the flow type of the parameter (optional)
	 * @return the chosen I/O format for exchanging data
	 */
	public String flow() default "(default)";
	
	
	/**
	 * Give the props of the parameter (optional)
	 * @return a Bool64 
	 */
	public long props() default 0L;
	
	
	/**
	 * Give the masks of the parameter (optional)
	 * @return a Bool
	 */
	public long mask() default 0x00L;

}
