package com.learning.singleton.lazysingleton;

/**
 * @author dkumar
 *
 */
public class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	}

	/**
	 * lazy Intialization
	 */
	/*
	 * public static LazySingleton getInstance() { if (instance == null) { instance
	 * = new LazySingleton(); } return instance; }
	 */

	// Thread safe lazy intilaization
	/*
	 * public static synchronized LazySingleton getInstance() { if (instance ==
	 * null) { instance = new LazySingleton(); }
	 * 
	 * return instance; }
	 */
//double check null thread safe singleton
	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
