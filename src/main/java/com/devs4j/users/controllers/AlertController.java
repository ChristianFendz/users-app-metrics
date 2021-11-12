package com.devs4j.users.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
public class AlertController {

	private static final Logger log = LoggerFactory.getLogger(AlertController.class);

	@PostMapping
	public ResponseEntity<String> postAlert(@RequestBody String alertMessager) {
		log.error("**********************************");
		log.error("**********************************");
		log.error("**********************************");
		log.error("Alert received {}", alertMessager);
		log.error("**********************************");
		log.error("**********************************");
		log.error("**********************************");
		log.error("**********************************");
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
