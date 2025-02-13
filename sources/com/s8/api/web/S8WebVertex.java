package com.s8.api.web;

import java.io.IOException;

import com.s8.api.bytes.ByteOutflow;


/**
 * 
 * The vertex attached to an {@link S8WebObject} object.
 * @see S8WebObject
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 *
 */
public interface S8WebVertex {

	
	/**
	 * Get the object id
	 * @return the id
	 */
	public String getId();
	
	
	
	/**
	 * Get the session
	 * @return the current session
	 */
	public S8WebFront getSession();
	
	
	/**
	 * Retrieved the Object attached to this vertex
	 * @return the attached object
	 */
	public S8WebObject getAttachedObject();



	/**
	 * Expose the vertex
	 * @param slot the slot selected
	 */
	public void expose(int slot);




	/**
	 * (System only)
	 * Publish the updates associated with this object
	 * @param outflow the outflow where we write updates
	 * @throws IOException exception raised while publishing
	 */
	public void publish(ByteOutflow outflow) throws IOException;
	



	/**
	 * The outbound side of this vertex
	 * @return the vertex fields handling module
	 */
	public S8WebVertexOutbound outbound();
	

	/**
	 * The inbound side of this vertex
	 * @return the vertex methods handling module
	 */
	public S8WebVertexInbound inbound();
	
	
	/**
	 * The providers container of this vertex
	 * @return the vertex generators handling module
	 */
	public WebS8VertexProviders providers();


}
