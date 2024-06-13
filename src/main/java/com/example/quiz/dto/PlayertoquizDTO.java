package com.example.quiz.dto;

import com.example.quiz.Playertoquiz;

import java.io.Serializable;
import java.util.UUID;

public class PlayertoquizDTO implements Serializable {

    private String playerName;

    private int score;
    private UUID id;

    public static PlayertoquizDTO from(Playertoquiz playertoquiz, String playerName) {
        var dto = new PlayertoquizDTO();
        dto.id = playertoquiz.getId();
        dto.score = playertoquiz.getScore();
        dto.playerName = playerName;
        return dto;
    }

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