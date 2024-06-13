package com.example.quiz.service;

import com.example.quiz.Player;
import com.example.quiz.dto.PlayerDTO;
import com.example.quiz.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerDTO getPlayerByName(String name) {
        return playerRepository.findByName(name)
                .map(PlayerDTO::new)
                .orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public PlayerDTO createPlayer(Player player) {
        Player savedPlayer = playerRepository.save(player);
        return new PlayerDTO(savedPlayer);
    }

    public PlayerDTO updatePlayer(UUID id, Player player) {
        playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
        player.setId(id);
        Player updatedPlayer = playerRepository.save(player);
        return new PlayerDTO(updatedPlayer);
    }

    public void deletePlayer(UUID id) {
        playerRepository.deleteById(id);
    }
}
