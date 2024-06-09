package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetingService;

@RestController
@RequestMapping(path = "/grettings")
public class GreetingController {

	private final GreetingService greetingService;

	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@GetMapping
	public ResponseEntity<String> getDemo() {
		String greeting = greetingService.getGrettings();
		return ResponseEntity.ok(greeting);
	}

	@GetMapping(path = "/name/{myName}")
	public ResponseEntity<String> getDemoByName(@PathVariable(name = "myName") String myMame) {
		String greeting = greetingService.getGrettingsByName(myMame);
		return ResponseEntity.ok(greeting);
	}

}
