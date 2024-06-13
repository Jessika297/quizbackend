package com.example.quiz.dto;

import com.example.quiz.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PlayerDTO {

    private UUID id;
    private String name;
    private String password;
    private Set<PlayertoquizDTO> scores = new HashSet<>();

    // Default constructor
    public PlayerDTO() {
    }

    // Parameterized constructor
    public PlayerDTO(Player player) {
        this.id = player.getId();
        this.name = player.getName();
        this.password = player.getPassword();
        player.getScores().forEach(score -> this.scores.add(PlayertoquizDTO.from(score, player.getName())));
    }

    // Getters and setters

    public Set<PlayertoquizDTO> getScores() {
        return scores;
    }

    public void setScores(Set<PlayertoquizDTO> scores) {
        this.scores = scores;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
