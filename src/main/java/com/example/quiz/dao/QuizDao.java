package com.example.quiz.dao;

import com.example.quiz.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuizDao extends JpaRepository<Quiz, UUID> {
}
