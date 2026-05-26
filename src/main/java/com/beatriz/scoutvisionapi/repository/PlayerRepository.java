package com.beatriz.scoutvisionapi.repository;

import com.beatriz.scoutvisionapi.entity.Player;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByPosition(String position);

    List<Player> findAll(Sort sort);
}
