package com.example.quiz.dto;

import java.util.UUID;

public class ScoreRequest {

    private UUID playerid;
    private UUID quizid;
    private int score;

    // Default constructor
    public ScoreRequest() {
    }

    // Parameterized constructor
    public ScoreRequest(UUID playerid, UUID quizid, int score) {
        this.playerid = playerid;
        this.quizid = quizid;
        this.score = score;
    }

    public UUID getPlayerid() {
        return playerid;
    }

    public void setPlayerid(UUID playerid) {
        this.playerid = playerid;
    }

    public UUID getQuizid() {
        return quizid;
    }

    public void setQuizid(UUID quizid) {
        this.quizid = quizid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
