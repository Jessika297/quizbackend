package com.example.quiz.repository;

import com.example.quiz.Question;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository<Question, UUID> {
    @EntityGraph(attributePaths = {"answer"})
    @Nonnull
    List<Question> findAll();

    @EntityGraph(attributePaths = "answers")
    @Nonnull
    Optional<Question> findById(@Nonnull UUID id);
}
