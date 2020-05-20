/**
 * 
 */
package com.tcs.moviecatalog.controller.unittest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tcs.moviecatalog.controller.DataController;
import com.tcs.moviecatalog.model.DataDto;
import com.tcs.service.DataService;

/**
 * @author Sammy
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(DataController.class)
public class DataControllerMockTest {

	@MockBean
	private DataService dataServiceMock;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getGreatestDataTest() {
		DataDto dataDto = new DataDto();
		dataDto.setGreatestNo(5);
		
		/*
		 * mockMvc.perform(get("/data/greatData") .contentType("application/json")
		 * .andExpect(status().isOk()));
		 */
		
	}
}
