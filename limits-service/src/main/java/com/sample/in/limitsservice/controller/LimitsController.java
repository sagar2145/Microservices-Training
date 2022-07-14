package com.sample.in.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.in.limitsservice.bean.Limits;
import com.sample.in.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/getLimits")
	public Limits getLimits() {
		return new Limits(configuration.getMaximum(), configuration.getMinimum());
	}

}
