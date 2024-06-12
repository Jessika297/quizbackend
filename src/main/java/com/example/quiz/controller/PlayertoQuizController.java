package com.example.quiz.controller;

import com.example.quiz.Playertoquiz;
import com.example.quiz.service.PlayertoQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playertoquizzes")
public class PlayertoQuizController {

    @Autowired
    private PlayertoQuizService playertoQuizService;

    @GetMapping
    public List<Playertoquiz> getAllPlayertoQuizzes() {
        return playertoQuizService.getAllPlayertoQuizzes();
    }

    @PostMapping
    public Playertoquiz addPlayertoQuiz(@RequestBody Playertoquiz playertoQuiz) {
        return playertoQuizService.addPlayertoQuiz(playertoQuiz);
    }

}
