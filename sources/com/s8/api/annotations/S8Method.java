package com.s8.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * 
 * The S8 Stack annotatino for method.
 *
 *
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface S8Method {

	
	/**
	 * Give the name of this method
	 * @return the name this field will be bound to
	 */
	public String name();
	
	
	/**
	 * Give the flow encoding type of this method
	 * @return the chosen I/O format for exchanging data
	 */
	public String flow() default "(default)";
	
	
	/**
	 * Give the properties of this method
	 * @return a Bool64 
	 */
	public long props() default 0L;
	
	
	/**
	 * Give the mask of this method
	 * @return the mask
	 */
	public long mask() default 0x00L;

}
