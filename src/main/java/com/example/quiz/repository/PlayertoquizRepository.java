package com.example.quiz.repository;

import com.example.quiz.Playertoquiz;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlayertoquizRepository extends JpaRepository<Playertoquiz, UUID> {

    @EntityGraph(attributePaths = {"playertoquiz"})
    @Nonnull
    List<Playertoquiz> findAll();

    @Query("SELECT ptq, p.name FROM Playertoquiz ptq JOIN ptq.player p WHERE ptq.quiz.id = :quizId")
    List<Object[]> findByQuizIdWithPlayerName(UUID quizId);
}
