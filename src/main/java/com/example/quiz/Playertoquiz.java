package com.example.quiz;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

//@Table(name = "playertoquiz", schema = "public")
@Entity
public class Playertoquiz implements Serializable {


    @ManyToOne
    @JoinColumn(name = "playerid")
    private Player playerid;

    @ManyToOne
    @JoinColumn(name = "quizid")
    private Quiz quizid;


    private int score;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
}

//Help