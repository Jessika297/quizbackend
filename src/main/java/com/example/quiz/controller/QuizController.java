package com.example.quiz.controller;

import com.example.quiz.dto.QuizDetailDTO;
import com.example.quiz.dto.QuizShortDTO;
import com.example.quiz.repository.QuizRepository;
import com.example.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuizService quizService;

    @GetMapping
    public List<QuizShortDTO> getAllQuizzes() {
        return quizRepository.findAll().stream().map(QuizShortDTO::from).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getQuizById(@PathVariable UUID id) {
        QuizDetailDTO quizDetailDTO = quizService.getQuizById(id);
        if (quizDetailDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(quizDetailDTO);
    }
}
