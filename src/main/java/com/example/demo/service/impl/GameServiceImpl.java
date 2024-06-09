package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	private static final Integer SECRET_NUMBER = Integer.valueOf(8);
	private static final String SUCCESS_MSG = "You win !";
	private static final String FAIL_MSG = "You lose !";

	@Override
	public Integer getSecretNumber() {
		return SECRET_NUMBER;
	}

	@Override
	public String getGuessTheNumber(Integer guessNumber) {
		if (SECRET_NUMBER.equals(guessNumber)) {
			return SUCCESS_MSG;
		}
		return FAIL_MSG;
	}

}
