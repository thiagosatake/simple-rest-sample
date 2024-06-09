package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	private static final String template = "Hello, %s!";

	@Override
	public String getGrettings() {
		return String.format(template, "my brother");
	}

	@Override
	public String getGrettingsByName(String name) {
		return String.format(template, name);
	}

}
