package com.gabriel.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.listgames.models.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
