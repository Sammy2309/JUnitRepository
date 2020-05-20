/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.dao.DataRepository;
import com.tcs.moviecatalog.model.DataDto;

/**
 * @author Sammy
 *
 */
@Service
public class DataService {

	@Autowired
	private DataRepository dataRepository;

	public DataService(DataRepository dataRepository) {
		super();
		this.dataRepository = dataRepository;
	}

	public DataDto findTheGreatestFromAllData() throws Exception{
		DataDto dataDto = new DataDto();
		int[] data = dataRepository.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		dataDto.setGreatestNo(greatest);
		return dataDto;
	}
}
