package com.example.quiz.dto;

import com.example.quiz.Playertoquiz;

import java.io.Serializable;
import java.util.UUID;

public class PlayertoquizDTO implements Serializable {

    private UUID id;
    private String playerName;
    private int score;

    // Default constructor
    public PlayertoquizDTO() {
    }

    // Parameterized constructor
    public PlayertoquizDTO(UUID id, String playerName, int score) {
        this.id = id;
        this.playerName = playerName;
        this.score = score;
    }

    // Constructor from Playertoquiz entity
    public PlayertoquizDTO(Playertoquiz playertoquiz) {
        this.id = playertoquiz.getId();
        this.score = playertoquiz.getScore();
        this.playerName = playertoquiz.getPlayer().getName(); // Assuming Player entity has getName method
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
