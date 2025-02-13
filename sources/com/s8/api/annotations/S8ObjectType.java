package com.s8.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * The Object Type annotation for the S8Stack.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface S8ObjectType {

	
	/**
	 * Give the name of the annotated object
	 * @return the typename
	 */
	public String name();
	
	
	/**
	 * Give the list of subtypes (or implied types) for further inspection by code crawlers.
	 * @return the list of subtypes
	 */
	public Class<?>[] sub() default {};
	
}
