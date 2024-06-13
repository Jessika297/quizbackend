package com.example.quiz.service;

import com.example.quiz.Player;
import com.example.quiz.Playertoquiz;
import com.example.quiz.Quiz;
import com.example.quiz.dto.ScoreRequest;
import com.example.quiz.repository.PlayerRepository;
import com.example.quiz.repository.PlayertoquizRepository;
import com.example.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
public class ScoreService {

    @Autowired
    private PlayertoquizRepository playertoquizRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private QuizRepository quizRepository;

    public void addScore(ScoreRequest scoreRequest) {
        Player player = playerRepository.findById(scoreRequest.getPlayerid())
                .orElseThrow(() -> new RuntimeException("Player not found"));
        Quiz quiz = quizRepository.findById(scoreRequest.getQuizid())
                .orElseThrow(() -> new RuntimeException("Quiz not found"));

        Playertoquiz playertoquiz = new Playertoquiz();
        playertoquiz.setId(UUID.randomUUID());
        playertoquiz.setPlayer(player);
        playertoquiz.setQuiz(quiz);
        playertoquiz.setScore(scoreRequest.getScore());

        playertoquizRepository.save(playertoquiz);
    }
}
