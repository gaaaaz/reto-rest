package com.entelgy.reto.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entelgy.reto.entity.Data;
import com.entelgy.reto.entity.Original;
import com.entelgy.reto.entity.OriginalData;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = { DataService.class })
public class DataServiceTest {

	@Autowired
	private DataService dataService;
	
	Original original;
	
	@BeforeEach
	public void setup() {
		dataService = new DataServiceImpl();
		
		OriginalData d = new OriginalData();
		d.setId(1); d.setFirstName("Christian"); d.setLastName("Garcia"); 
		d.setEmail("cgarcia@unmsm.edu.pe"); d.setAvatar("test");
		
		List<OriginalData> data = new ArrayList<>();
		data.add(d);
		
		original = new Original();
		original.setPage(1); original.setPerPage(6); original.setPage(12); original.setTotal(12); 
		original.setTotalPages(100);original.setData(data);
	}
	
	@Test
	public void getStructureResponseTest() {
		List<Data> newResponse = dataService.getResponseStructure(original);
		assertThat(newResponse.size()).isGreaterThan(0);
	}
	
}
