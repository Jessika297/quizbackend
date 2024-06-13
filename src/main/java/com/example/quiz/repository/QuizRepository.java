package com.example.quiz.repository;

import com.example.quiz.Quiz;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, UUID> {

    @EntityGraph(attributePaths = {"questions"})
    @Nonnull
    List<Quiz> findAll();

    @EntityGraph(attributePaths = {"questions", "questions.answers"})
    @Nonnull
    Optional<Quiz> findById(@Nonnull UUID id);

}
