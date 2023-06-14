package com.gabriel.listgames.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.listgames.dto.GameDTO;
import com.gabriel.listgames.models.Game;
import com.gabriel.listgames.repositories.GameRepository;

@Service
public class GameService {
 
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> findAll(){
		List<GameDTO> listaDTO = new ArrayList<>();

		List <Game> games = gameRepository.findAll();
		for ( Game game : games) {
			GameDTO dto = new GameDTO(game);
			listaDTO.add(dto);
		}
		return listaDTO;
	}
}
