/**
 * 
 */
package com.tcs.moviecatalog.service.unittest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tcs.dao.DataRepository;
import com.tcs.moviecatalog.model.DataDto;
import com.tcs.service.DataService;

/**
 * @author Sammy
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataServiceMockTestUsingMockBean {
	
	@MockBean
	private DataRepository dataRepositoryMock;
	
	@Autowired
	private DataService dataService;
	
	@Test
	public void testFindTheGreatestFromAllData() throws Exception{
		when(dataRepositoryMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		DataDto dataDto = dataService.findTheGreatestFromAllData();
		assertEquals(24, dataDto.getGreatestNo());
	}


}
