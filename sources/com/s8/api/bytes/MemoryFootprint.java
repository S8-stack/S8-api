package com.s8.api.bytes;



/**
 * 
 * A Mmeory footprint object for sampling/forecasting memory usage of some objects in serialization operations.
 * 
 * @author Pierre Convert
 * Copyright (C) 2025, Pierre Convert. All rights reserved.
 * 
 */
public class MemoryFootprint {
	
	/**
	 * <p> Proxy of object allocation in RAM: object. Memory footprint+ </p>
	 * <p>
	 * From:
	 * https://stackoverflow.com/questions/258120/what-is-the-memory-consumption-of-an-object-in-java:
	 * </p>
	 * In a modern 64-bit JDK, an object has a 12-byte header, padded to a
	 * multiple of 8 bytes, so the minimum object size is 16 bytes. For 32-bit JVMs,
	 * the overhead is 8 bytes, padded to a multiple of 4 bytes. (From Dmitry
	 * Spikhalskiy's answer, Jayen's answer, and JavaWorld.)
	 */
	public final static long OBJECT_ALLOCATION_BYTECOUNT = 32;
	
	/**
	 * Bytecount default for object reference
	 */
	public final static long OBJECT_REFERENCE_BYTECOUNT = 8;
	
	
	
	/**
	 * Bytecount default for map entry
	 */
	public final static long ENTRY_BYTECOUNT = 20;

	private long nInstances;
	
	private long nReferences;
	
	private long nEntries;
	
	private long nBytesStored;
	
	
	/**
	 * Default constructor
	 */
	public MemoryFootprint() {
		super();
	}
	
	/**
	 * Report an instance and increment the number of instance of this memory footprint.
	 */
	public void reportInstance() {
		nInstances++;
	}
	
	/**
	 * Report many instances and increment the number of instance of this memory footprint.
	 * @param n number of instances
	 */
	public void reportInstances(int n) {
		nInstances+=n;
	}
	
	
	/**
	 * Report a reference and increment the number of references of this memory footprint.
	 */
	public void reportReference() {
		nReferences++;
	}
	
	/**
	 * Report a reference and increment the number of references of this memory footprint.
	 * @param n number of references
	 */
	public void reportReferences(int n) {
		nReferences+=n;
	}
	
	/**
	 * Report an entry and increment the number of entries of this memory footprint.
	 */
	public void reportEntry() {
		nEntries++;
	}
	
	
	/**
	 * Report bytes on this memory footprint.
	 * @param payload the bytecount of the paylod
	 */
	public void reportBytes(long payload) {
		nBytesStored+=payload;
	}
	
	
	
	/**
	 * Calculate on the fly the bytecount associated with the reported instances.
	 * @return the current bytecount
	 */
	public long getBytecount() {
		return nInstances * OBJECT_ALLOCATION_BYTECOUNT 
				+ nReferences * OBJECT_REFERENCE_BYTECOUNT
				+ nEntries * ENTRY_BYTECOUNT 
				+ nBytesStored;
	}
	
}
