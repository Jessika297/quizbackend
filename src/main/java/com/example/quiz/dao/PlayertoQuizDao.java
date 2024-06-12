package com.example.quiz.dao;

import com.example.quiz.Playertoquiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayertoQuizDao extends JpaRepository<Playertoquiz, UUID> {
}
