package com.ajinkya.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajinkya.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration confiuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(confiuration.getMinimum(), confiuration.getMaximum());
	}
}
