package com.example.quiz.controller;

import com.example.quiz.Player;
import com.example.quiz.dto.PlayerDTO;
import com.example.quiz.exception.ResourceNotFoundException;
import com.example.quiz.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/{name}")
    public PlayerDTO getPlayerByName(@PathVariable String name) {
        Player player = playerRepository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Player not found"));
        return new PlayerDTO(player);
    }
}
