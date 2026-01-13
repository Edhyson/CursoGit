package com.edhy.kafka.test.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationC {

	
	@KafkaListener(topics = "locationx",groupId = "user-group")
	public void getLocationC(String location) {
		System.out.println("Mensaje:"+location);
	}
}
