package com.example.quiz;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class PlayertoQuiz implements Serializable {

    @EmbeddedId
    private PlayertoQuizKey id;

    private int score;

    // Getters and setters
    public PlayertoQuizKey getId() {
        return id;
    }

    public void setId(PlayertoQuizKey id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

