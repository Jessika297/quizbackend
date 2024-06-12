package com.example.quiz;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String password;
    @OneToMany(mappedBy = "playerid", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Playertoquiz> scores = new HashSet<>();

    public Set<Playertoquiz> getScores() {
        return scores;
    }

    public void setScores(Set<Playertoquiz> scores) {
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
