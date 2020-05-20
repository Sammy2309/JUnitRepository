/**
 * 
 */
package com.tcs.moviecatalog.repository.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tcs.dao.DataRepository;

/**
 * @author Sammy
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataRepositoryMockTest {

	@Autowired
	private DataRepository dataRepository;
	
	@Test
	public void testRetrieveAllData() {
		assertEquals(3, dataRepository.retrieveOneData());
	}
}
