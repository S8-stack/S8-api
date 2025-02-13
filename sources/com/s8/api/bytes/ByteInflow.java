package com.s8.api.bytes;

import java.io.IOException;


/**
 * <p>
 * Unified in-flow of bytes with getters for standard primitives.
 * </p>
 * 
 * <p>
 * /!\ All array or String lengths are encoded as UInt32 to reflect their
 * maximum possible length in JAVA.
 * </p>
 * 
 *
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 * 
 */
public interface ByteInflow {


	/**
	 * Standard encoding for FALSE boolean value/
	 */
	public final static int BOOL8_FALSE = 0x37;
	
	/**
	 * Standard encoding for TRUE boolean value/
	 */
	public final static int BOOL8_TRUE = 0x53;

	
	/**
	 * getCount
	 * 
	 * @return the count
	 */
	public long getCount();



	/**  
	 * getByte
	 * 
	 * @return next byte
	 * @throws IOException exception while reading from the flow
	 */
	public byte getByte() throws IOException;


	/**
	 * getBool8
	 * 
	 * @return next byte
	 * @throws IOException exception while reading from the flow
	 */
	public default boolean getBool8() throws IOException {
		switch(getUInt8()) {
		case BOOL8_FALSE : return false;
		case BOOL8_TRUE : return true;
		default : throw new IOException("No matching code for boolean value");
		}
	}


	/**
	 * length passed as argument
	 * 
	 * @param length next bytes, where n is the length of the <code>bytes</code> array
	 * @return the byte array read from the flow
	 * @throws IOException exception while reading from the flow
	 */
	public byte[] getByteArray(int length) throws IOException;



	/**
	 * Tells if the next bytes in the ByteInput are matching the sequence passed as
	 * argument. Note that this method will return an exception if there is not enough
	 * bytes to make the comparison.
	 * 
	 * @param sequence the bytes sequence to be tested against the inflow
	 * @return true if sequence is matching underlying bytes.
	 * @throws IOException exception while reading from the flow
	 */
	public boolean matches(byte[] sequence) throws IOException;


	/**
	 * getFlags8
	 * 
	 * @return the flags
	 * @throws IOException exception while reading from the flow
	 */
	boolean[] getFlags8() throws IOException;
	

	
	/**
	 * getUInt7x
	 * 
	 * @return the long value read from the flow
	 * @throws IOException exception while reading from the flow
	 */
	public long getUInt7x() throws IOException;




	/**
	 * getUInt8
	 * 
	 * @return the next Unsigned Integer 8 bits (1 byte)
	 * @throws IOException exception while reading from the flow
	 */
	public int getUInt8() throws IOException;


	/**
	 * getUInt16
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public int getUInt16() throws IOException;


	/**
	 * getUInt24
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public int getUInt24() throws IOException;


	/**
	 * getUInt31
	 * 
	 * @return the next Unsigned Integer 31 bits (4 bytes, first bit ignored)
	 * @throws IOException exception while reading from the flow
	 */
	public int getUInt31() throws IOException;


	/**
	 * getUInt32
	 * 
	 * Curretly doing the same as <code>getUInt31</code>
	 * @return the int read forom flow
	 * @throws IOException exception while reading from the flow
	 */
	public int getUInt32() throws IOException;



	/**
	 * getUInt40
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public long getUInt40() throws IOException;



	/**
	 * getUInt48
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public long getUInt48() throws IOException;



	/**
	 * getUInt56
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public long getUInt56() throws IOException;


	/**
	 * getUInt64
	 * 
	 * @return the next Unsigned Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public long getUInt64() throws IOException;



	/**
	 * getInt8
	 * 
	 * @return the value
	 * @throws IOException exception while reading from the flow
	 */
	public byte getInt8() throws IOException;


	/**
	 * getInt16
	 * 
	 * @return the next Signed Integer 16 bits (2 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public short getInt16() throws IOException;

	/**
	 * getInt32
	 * 
	 * @return the next Signed Integer 32 bits (4 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public int getInt32() throws IOException;
	
	
	/**
	 * getInt32Array
	 * 
	 * @return the value
	 * @throws IOException exception while reading from the flow
	 */
	public default int[] getInt32Array() throws IOException {
		int n = getInt32();
		if(n >= 0) {
			int[] values = new int[n];
			for(int i = 0; i < n; i++) { values[i] = getInt32(); }
			return values;
		}
		else { return null; } // null
	}


	/**
	 * getInt64
	 * 
	 * @return the next Signed Integer 64 bits (8 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public long getInt64() throws IOException;


	/**
	 * getFloat32
	 * 
	 * @return the next Float 32 bits (4 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public float getFloat32() throws IOException;


	/**
	 * getFloat64
	 * 
	 * @return the next Float 64 bits (8 bytes)
	 * @throws IOException exception while reading from the flow
	 */
	public double getFloat64() throws IOException;
	

	/**
	 * getFloat64Array
	 * 
	 * @return the value
	 * @throws IOException exception while reading from the flow
	 */
	public default double[] getFloat64Array() throws IOException {
		int n = getInt32();
		if(n >= 0) {
			double[] values = new double[n];
			for(int i = 0; i < n; i++) { values[i] = getFloat64(); }
			return values;
		}
		else { return null; } // null
	}



	/**
	 * getStringUTF8
	 * 
	 * ASCII char only String, whose length is encoded on 8bits (max length is 256).
	 * @return the value
	 * @throws IOException exception while reading from the flow
	 */
	public String getStringUTF8() throws IOException;
	
	

	/**
	 * startRecording
	 * 
	 * @param outflow theouflow
	 */
	public void startRecording(ByteOutflow outflow);


	/**
	 * stopRecording
	 * 
	 * @throws IOException exception while reading from the flow
	 */
	public void stopRecording() throws IOException;


}