package com.entelgy.reto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entelgy.reto.entity.Data;
import com.entelgy.reto.entity.Original;
import com.entelgy.reto.entity.OriginalData;

@Service
public class DataServiceImpl implements DataService {

	@Override
	public List<Data> getResponseStructure(Original response) {
		
		List<Data> newResponse = new ArrayList<>();
		
		for (OriginalData o : response.getData()) {
			newResponse.add(new Data(o.getId(), o.getLastName(), o.getEmail()));
		}
		
		return newResponse;
	}

	
	
}
