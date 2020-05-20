/**
 * 
 */
package com.tcs.moviecatalog.service.unittest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.tcs.dao.DataRepository;
import com.tcs.moviecatalog.model.DataDto;
import com.tcs.service.DataService;

/**
 * @author Sammy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class DataServiceMockTestUsingMockitoRunner {

	@Mock
	DataRepository dataRepositoryMock;
	
	@InjectMocks
	DataService dataService;
	
	@Test
	public void findTheGreatestFromAllDataTest() throws Exception{
		when(dataRepositoryMock.retrieveAllData()).thenReturn( new int[] { 1, 2, 3, 4, 5 });
		DataDto dataDto = dataService.findTheGreatestFromAllData();
		assertEquals(5, dataDto.getGreatestNo());
	}

}
