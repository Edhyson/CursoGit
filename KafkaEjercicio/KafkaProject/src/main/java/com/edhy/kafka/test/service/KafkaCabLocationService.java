package com.edhy.kafka.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaCabLocationService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String ruta) {
		kafkaTemplate.send("locationx", ruta);
		return true;
	}
}
