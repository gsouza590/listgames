package com.gabriel.listgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.listgames.dto.GameDTO;
import com.gabriel.listgames.dto.GameFullDTO;
import com.gabriel.listgames.services.GameService;

@RestController
@RequestMapping(value= "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameFullDTO findById(@PathVariable Long id) {
		GameFullDTO result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameDTO> findAll() {
		List<GameDTO> result = gameService.findAll();
		return result;
	}
	
}
