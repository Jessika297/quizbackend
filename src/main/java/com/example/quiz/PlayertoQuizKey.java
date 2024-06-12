package com.example.quiz;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class PlayertoQuizKey implements Serializable {
    private UUID playerid;
    private UUID quizid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayertoQuizKey that = (PlayertoQuizKey) o;

        if (!playerid.equals(that.playerid)) return false;
        return quizid.equals(that.quizid);
    }

    @Override
    public int hashCode() {
        int result = playerid.hashCode();
        result = 31 * result + quizid.hashCode();
        return result;
    }
}
