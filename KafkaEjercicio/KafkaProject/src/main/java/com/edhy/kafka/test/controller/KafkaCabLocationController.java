package com.edhy.kafka.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edhy.kafka.test.service.KafkaCabLocationService;

@RestController
@RequestMapping("/location")
public class KafkaCabLocationController {

	@Autowired
	private KafkaCabLocationService cabLocationService;
	
	@GetMapping
	public ResponseEntity updateLocation() throws InterruptedException {
		
		int rango =100;
		
		while(rango> 0) {
			cabLocationService.updateLocation(Math.random()+"XY");
			Thread.sleep(1000);
			rango --;
		}
		
		
		return  new ResponseEntity<>(Map.of("message","Location Uodate"),HttpStatus.OK);
	}
}
