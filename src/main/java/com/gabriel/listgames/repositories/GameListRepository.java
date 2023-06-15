package com.gabriel.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.listgames.models.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
