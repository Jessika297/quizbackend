package com.example.quiz.dto;

import java.io.Serializable;
import java.util.UUID;


public class PlayertoquizDTO implements Serializable {

    private String playerName;

    private int score;
    private UUID id;

    // Getters and setters
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

    //from dings mappen, also player mappen
    //quiz holen -> scores -> player -> playername
}
