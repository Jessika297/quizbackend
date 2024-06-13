package com.example.quiz.service;

import com.example.quiz.Quiz;
import com.example.quiz.dto.QuizDetailDTO;
import com.example.quiz.dto.QuizShortDTO;
import com.example.quiz.repository.QuizRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<QuizShortDTO> getAllQuizzes() {
        return quizRepository.findAll().stream()
                .map(QuizShortDTO::from)
                .collect(Collectors.toList());
    }

    public QuizDetailDTO getQuizById(UUID id) {
        return quizRepository.findById(id)
                .map(quiz -> {
                    Hibernate.initialize(quiz.getQuestions());
                    quiz.getQuestions().forEach(question -> Hibernate.initialize(question.getAnswers()));
                    return QuizDetailDTO.from(quiz);
                })
                .orElseThrow(() -> new RuntimeException("Quiz not found"));
    }

    public QuizDetailDTO createQuiz(Quiz quiz) {
        Quiz savedQuiz = quizRepository.save(quiz);
        return QuizDetailDTO.from(savedQuiz);
    }

    public QuizDetailDTO updateQuiz(UUID id, Quiz quiz) {
        quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setId(id);
        Quiz updatedQuiz = quizRepository.save(quiz);
        return QuizDetailDTO.from(updatedQuiz);
    }

    public void deleteQuiz(UUID id) {
        quizRepository.deleteById(id);
    }
}

