package com.s8.api.flow.delivery;



/**
 * A Web resource abstraction
 */
public class S8WebResource {

	
	/**
	 * To be re-interpreted as a MIME type
	 */
	public final String type;
	
	
	/**
	 * data
	 */
	public final byte[] data;

	
	/**
	 * Main constructor
	 * @param type the resources type (MIME)
	 * @param data the resource content
	 */
	public S8WebResource(String type, byte[] data) {
		super();
		this.type = type;
		this.data = data;
	}
	
	
}
