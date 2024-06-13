package com.example.quiz;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Playertoquiz {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerid", nullable = false)
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizid", nullable = false)
    private Quiz quiz;

    // getters and setters
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}