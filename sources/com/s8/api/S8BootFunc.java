package com.s8.api;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.web.S8WebFront;

/**
 * 
 */
public abstract class S8BootFunc {

	/**
	 * page
	 */
	public final static String BOOT_PAGE_PREFIX = "/page/";

	

	/**
	 * main
	 */
	public final static String MAIN_BOOT_PAGE = "main";





	public final String name;


	/**
	 * 
	 * @param name
	 */
	public S8BootFunc(String name) {
		super();
		this.name = name;
	}


	/**
	 * 
	 * @param front
	 * @param flow
	 * @throws Exception
	 */
	public abstract void boot(S8WebFront front, S8AsyncFlow flow) throws Exception;



	/**
	 * 
	 * @param pathname
	 * @return
	 */
	public static boolean isBootPage(String pathname) {
		return BOOT_PAGE_PREFIX.equals(pathname.substring(0, BOOT_PAGE_PREFIX.length()));
	}

	public static String getBootName(String pathname) {
		return pathname.substring(BOOT_PAGE_PREFIX.length());
	}
}
