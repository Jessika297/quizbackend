package com.example.quiz.dao;

import com.example.quiz.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerDao extends JpaRepository<Player, UUID> {
}
