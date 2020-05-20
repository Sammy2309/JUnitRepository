/**
 * 
 */
package com.tcs.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Sammy
 *
 */
@Repository
public class DataRepository {

	public int[] retrieveAllData() {
		// Some dummy data
		// Actually this should talk to some database to get all the data
		return new int[] { 1, 2, 3, 4, 5 };
	}
	
	public int retrieveOneData() {
		return 3;
	}
}
