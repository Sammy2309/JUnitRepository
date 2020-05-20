/**
 * 
 */
package com.tcs.moviecatalog.model;

import org.springframework.stereotype.Component;

/**
 * @author Sammy
 *
 */
@Component
public class DataDto {

	private int greatestNo;

	/**
	 * @return the greatestNo
	 */
	public int getGreatestNo() {
		return greatestNo;
	}

	/**
	 * @param greatestNo the greatestNo to set
	 */
	public void setGreatestNo(int greatestNo) {
		this.greatestNo = greatestNo;
	}
	
	
}
