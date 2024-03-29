package com.s8.api.web;

import java.io.IOException;

import com.s8.api.bytes.ByteOutflow;


/**
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 *
 */
public interface S8WebVertex {

	
	/**
	 * 
	 * @return index
	 */
	public String getId();
	
	
	
	public S8WebFront getSession();
	
	
	/**
	 * Object attached to this vertex
	 * @return
	 */
	public S8WebObject getAttachedObject();



	public void expose(int slot);




	public void publish(ByteOutflow outflow) throws IOException;
	



	/**
	 * 
	 * @return the vertex fields handling module
	 */
	public S8WebVertexOutbound outbound();
	

	/**
	 * 
	 * @return the vertex methods handling module
	 */
	public S8WebVertexInbound inbound();
	
	
	/**
	 * 
	 * @return the vertex generators handling module
	 */
	public WebS8VertexProviders providers();


}
