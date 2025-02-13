package com.s8.api.serial;

import java.io.IOException;

import com.s8.api.bytes.ByteOutflow;



/**
 * Can parse from a <code>ByteInflow</code> and compose to a <code>ByteOutflow</code>.
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
public interface S8Serializable {


	


	/**
	 * Serialize this object in the outflow passed as argument.
	 * @param outflow the outflow
	 * @throws IOException exception raised by the serialization and outflow writing process
	 */
	public void serialize(ByteOutflow outflow) throws IOException;
	
	

	/**
	 * Get serial prototype
	 * @return the serial prototype
	 */
	public abstract S8SerialPrototype<?> getSerialPrototype();
	
	
	/**
	 * return a proxy of memory footprint
	 * @return the value
	 */
	public long computeFootprint();
	
	
	/**
	 * Generate a deep clone of this serializable
	 * @return a deep clone
	 */
	public S8Serializable deepClone();

	
	
	
}