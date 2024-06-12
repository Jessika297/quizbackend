package com.example.quiz.dao;

import com.example.quiz.PlayertoQuiz;
import com.example.quiz.PlayertoQuizKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayertoQuizDao extends JpaRepository<PlayertoQuiz, PlayertoQuizKey> {
}
