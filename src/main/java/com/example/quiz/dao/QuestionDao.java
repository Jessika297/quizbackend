package com.example.quiz.dao;

import com.example.quiz.Question;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    @EntityGraph(attributePaths = {"answer"})
    @Nonnull
    List<Question> findAll();
}
