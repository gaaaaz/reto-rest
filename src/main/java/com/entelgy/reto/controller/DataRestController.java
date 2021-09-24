package com.entelgy.reto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.entelgy.reto.entity.Data;
import com.entelgy.reto.entity.Original;
import com.entelgy.reto.service.DataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
@RequestMapping("/data")
public class DataRestController {

	@Autowired
	private DataService dataService;
	
	@Value("${com.entelgy.url}")
	private String url;
	
	@GetMapping("/all")
	public ResponseEntity<String> getDataStructure(){
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Original> response = restTemplate.getForEntity(url, Original.class);
		
		if(response.getStatusCodeValue() != HttpStatus.OK.value()) {
			return new ResponseEntity<String>(response.getBody().toString(), response.getStatusCode());
		}
		
		List<Data> newResponse = dataService.getResponseStructure(response.getBody());
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer().withRootName("data");
		
		try {
			return ResponseEntity.ok(writer.writeValueAsString(newResponse));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
}
