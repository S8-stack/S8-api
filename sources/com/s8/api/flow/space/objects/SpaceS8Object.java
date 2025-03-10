package com.s8.api.flow.space.objects;

import com.s8.api.annotations.S8ObjectType;
import com.s8.api.exceptions.S8IOException;

/**
 * <p>
 * <code>S8Shell</code> represents an enclosure of a graph of S8Object. This
 * shell has multiple role:
 * </p>
 * <ul>
 * <li>#1 LOGICAL UNIT: It defines a logical unit from the application logic
 * point of view</li>
 * <li>#2 SYNCHRONIZATION: It is the primary scope of lock enabling async
 * processes</li>
 * <li>#3 STORAGE UNIT: It acts a persistency bucket (and therefore must be
 * considered the main element to understand the latency of the application
 * implementation.)</li>
 * <li>#4 VERSION UNIT: It is the key building block for substitution pattern,
 * that acts as a repository state.</li>
 * <li>#5 ENCAPSULATION: It is the primary encapsulation control unit. Note that
 * we cannot access (from a logical point of view the inner nodes of the graph
 * encapsulated by the shell, unless they are specifically designated as logical
 * ports of the shell.</li>
 * </ul>
 * <p>
 * Note that <code>S8object</code> objects used as logical ports SHOULD refer
 * the shell (typically as a field).
 * </p>
 * 
 * 
 * 
/**
 * <p>Unpinned object applications:</p>
 * <ul>
 * <li><b>transient</b>: object created on the fly that don't need any S8Shell handling and management</li>
 * <li><b>private</b>: none of <code>S8Struct</code> object method are exposed for direct request</li>
 * <li><b>managed</b>: acess control is non-existent (for access control, upgrade to <code>S8Object</code></li>
 * <li><b>leaves</b>: typical used as leaves of a tree which nodes are <code>S8Object</code></li>
 * </ul>
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
@S8ObjectType(name = "alpha/S8Object", sub= {})
public class SpaceS8Object {
	
	
	/* <field-properties> */
	
	/**
	 * Utility
	 */
	public final static long REF = 0x0000000000000001L;
	
	
	/* </field-properties> */
	
	
	/**
	 * Object listeners
	 */
	public SpaceS8Vertex S8_vertex;
	
	
	/**
	 * Perform initial binding of object with vertex, vertex itself being bound to its shell
	 * 
	 */
	public SpaceS8Object() {
	}
	
	
	
	/**
	 * Report an update for a field 
	 * @param fieldName the name of the field fo which an update is to be reported
	 * @throws S8IOException the exception raised while reporting
	 */
	public void reportFieldUpdate(String fieldName) throws S8IOException {
		if(S8_vertex!=null) { S8_vertex.reportChange(fieldName); }
	}
	
	
	/**
	 * Report an update for many fields
	 * @param fieldNames the name of the fields fo which updates are to be reported
	 * @throws S8IOException the exception raised while reporting
	 */
	public void reportFieldUpdates(String... fieldNames) throws S8IOException {
		if(S8_vertex!=null) { for(String fieldName : fieldNames) { S8_vertex.reportChange(fieldName); } }
	}
	
}
