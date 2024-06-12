package com.example.quiz.controller;

import com.example.quiz.PlayertoQuiz;
import com.example.quiz.PlayertoQuizKey;
import com.example.quiz.service.PlayertoQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/playertoquizzes")
public class PlayertoQuizController {

    @Autowired
    private PlayertoQuizService playertoQuizService;

    @GetMapping
    public List<PlayertoQuiz> getAllPlayertoQuizzes() {
        return playertoQuizService.getAllPlayertoQuizzes();
    }

    @GetMapping("/{playerid}/{quizid}")
    public Optional<PlayertoQuiz> getPlayertoQuizById(@PathVariable UUID playerid, @PathVariable UUID quizid) {
        PlayertoQuizKey id = new PlayertoQuizKey();
        id.setPlayerid(playerid);
        id.setQuizid(quizid);
        return playertoQuizService.getPlayertoQuizById(id);
    }

    @PostMapping
    public PlayertoQuiz addPlayertoQuiz(@RequestBody PlayertoQuiz playertoQuiz) {
        return playertoQuizService.addPlayertoQuiz(playertoQuiz);
    }

    @DeleteMapping("/{playerid}/{quizid}")
    public void deletePlayertoQuiz(@PathVariable UUID playerid, @PathVariable UUID quizid) {
        PlayertoQuizKey id = new PlayertoQuizKey();
        id.setPlayerid(playerid);
        id.setQuizid(quizid);
        playertoQuizService.deletePlayertoQuiz(id);
    }
}
