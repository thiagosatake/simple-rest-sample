package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GameService;

@RestController
@RequestMapping(path = "/game")
public class GameController {

	private final GameService gameService;

	public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping(value = "/number")
	public ResponseEntity<Integer> getNumber() {
		Integer secretNumber = gameService.getSecretNumber();
		return ResponseEntity.ok(secretNumber);
	}

	@GetMapping(value = "/number-guess")
	public ResponseEntity<String> getGuessTheNumber(@RequestParam(name = "number") Integer number) {
		String message = gameService.getGuessTheNumber(number);
		return ResponseEntity.ok(message);
	}

}
