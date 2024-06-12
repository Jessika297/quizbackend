package com.example.quiz.dao;

import com.example.quiz.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AnswerDao extends JpaRepository<Answer, UUID> {
}
