package com.entelgy.reto.service;

import java.util.List;


import com.entelgy.reto.entity.Data;
import com.entelgy.reto.entity.Original;

public interface DataService {

	public List<Data> getResponseStructure(Original response); 
	
}
