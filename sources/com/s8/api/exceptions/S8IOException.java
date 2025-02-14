package com.s8.api.exceptions;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * 
 * 
 * S8 IO Exception
 * 
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public class S8IOException extends IOException {
	

	
	/**
	 * SERIAL UID
	 */
	private static final long serialVersionUID = -7581262624376703609L;

	
	/**
	 * type of the implied object
	 */
	private Class<?> type;
	
	/**
	 * Field
	 */
	private Field field;
	
	/**
	 * Involved method
	 */
	private Method method;
	
	
	/**
	 * Cause exception
	 */
	private Exception cause;
	
	
	/**
	 * Main constructor
	 * @param message the main wrapped message
	 */
	public S8IOException(String message) {
		super(message);
	}
	
	
	/**
	 * Constructor for specific type
	 * @param message the wrapped message
	 * @param type the involved type
	 */
	public S8IOException(String message, Class<?> type) {
		super(message+", for @type: "+type);
		this.type = type;
	}
	
	
	/**
	 * Constructor for type + cause catching
	 * @param message the wrapped message
	 * @param type the involved type
	 * @param cause the root cause exception
	 */
	public S8IOException(String message, Class<?> type, Exception cause) {
		super(message+", due to "+cause.getMessage()+", for @type: "+type);
		this.type = type;
		this.cause = cause;
	}
	
	
	/**
	 * Constructor for field + cause catching
	 * @param message the wrapped message
	 * @param field the involved field
	 * @param cause the root cause
	 */
	public S8IOException(String message, Field field, Exception cause) {
		super(message+", due to "+cause.getMessage()+", for outflow @field: "+field);
		this.field = field;
		this.type = field.getDeclaringClass();
		this.cause = cause;
	}
	
	
	/**
	 * Constructor for method + cause catching
	 * @param message the wrapped message
	 * @param method the involved method
	 * @param cause the root cause
	 */
	public S8IOException(String message, Method method, Exception cause) {
		super(message+", due to "+cause.getMessage()+", for outflow @method: "+method);
		this.method = method;
		this.type = method.getDeclaringClass();
		this.cause = cause;
	}
	
	
	
	/**
	 * Get the involved type
	 * @return the type
	 */
	public Class<?> getInvolvedType(){
		return type;
	}
	
	
	/**
	 * Get the involved field
	 * @return the field
	 */
	public Field getInvolvedField(){
		return field;
	}
	
	
	/**
	 * Get the involved method
	 * @return the method
	 */
	public Method getInvolvedMethod(){
		return method;
	}
	
	
	/**
	 * Get the root cause
	 * @return the cause
	 */
	@Override
	public Exception getCause(){
		return cause;
	}
}
