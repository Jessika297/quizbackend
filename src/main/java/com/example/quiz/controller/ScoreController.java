package com.example.quiz.controller;

import com.example.quiz.Playertoquiz;
import com.example.quiz.dto.ScoreRequest;
import com.example.quiz.exception.ResourceNotFoundException;
import com.example.quiz.repository.PlayerRepository;
import com.example.quiz.repository.PlayertoquizRepository;
import com.example.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private PlayertoquizRepository playertoquizRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private QuizRepository quizRepository;

    @PostMapping
    public void addScore(@RequestBody ScoreRequest scoreRequest) {
        Playertoquiz playertoquiz = new Playertoquiz();
        playertoquiz.setId(UUID.randomUUID());
        playertoquiz.setPlayer(playerRepository.findById(scoreRequest.getPlayerid()).orElseThrow(() -> new ResourceNotFoundException("Player not found")));
        playertoquiz.setQuiz(quizRepository.findById(scoreRequest.getQuizid()).orElseThrow(() -> new ResourceNotFoundException("Quiz not found")));
        playertoquiz.setScore(scoreRequest.getScore());

        playertoquizRepository.save(playertoquiz);
    }
}
