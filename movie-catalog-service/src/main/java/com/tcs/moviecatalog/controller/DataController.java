/**
 * 
 */
package com.tcs.moviecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.moviecatalog.model.DataDto;
import com.tcs.service.DataService;

/**
 * @author Sammy
 *
 */
@RestController
@RequestMapping("/data")
public class DataController {

	@Autowired
	private DataService dataService;
	
	@RequestMapping(value = "/greatData", method = RequestMethod.GET)
	public DataDto getGreatestData() {
		DataDto dataDto = new DataDto();
		try {
			dataDto = dataService.findTheGreatestFromAllData();
		}catch(Exception e) {
			//Catch the exception
		}
		return dataDto;
	}
}
