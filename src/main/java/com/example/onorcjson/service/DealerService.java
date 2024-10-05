package com.example.onorcjson.service;

import com.example.onorcjson.model.Dealer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;


@Service
public class DealerService {

	private ObjectMapper objectMapper;

	public DealerService(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	
	public Dealer readDealerFromClasspath() throws IOException{
		ClassPathResource resource = new ClassPathResource("dealer.json");
		return objectMapper.readValue(resource.getInputStream(), Dealer.class);
	}
}
