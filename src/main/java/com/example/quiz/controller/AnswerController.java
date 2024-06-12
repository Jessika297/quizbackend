package com.example.quiz.controller;

import com.example.quiz.Answer;
import com.example.quiz.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping
    public List<Answer> getAllAnswers() {
        return answerService.getAllAnswers();
    }

    @GetMapping("/{id}")
    public Optional<Answer> getAnswerById(@PathVariable UUID id) {
        return answerService.getAnswerById(id);
    }

    @PostMapping
    public Answer addAnswer(@RequestBody Answer answer) {
        return answerService.addAnswer(answer);
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable UUID id) {
        answerService.deleteAnswer(id);
    }
}
