package com.gabriel.listgames.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.listgames.dto.GameDTO;
import com.gabriel.listgames.services.GameService;

@RestController
@RequestMapping(value= "/games")
public class GameController {
	
	private GameService gameService;
	
	@GetMapping
	public List<GameDTO> findAll(){
		return gameService.findAll();
	}
	

}
