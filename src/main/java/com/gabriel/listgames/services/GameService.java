package com.gabriel.listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabriel.listgames.dto.GameDTO;
import com.gabriel.listgames.dto.GameFullDTO;
import com.gabriel.listgames.models.Game;
import com.gabriel.listgames.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameFullDTO findById(@PathVariable Long listId) {
		Game result = gameRepository.findById(listId).get();
		return new GameFullDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameDTO::new).toList();
	}
}
