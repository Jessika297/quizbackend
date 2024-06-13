package com.example.quiz.service;

import com.example.quiz.Question;
import com.example.quiz.dto.QuestionDTO;
import com.example.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Transactional
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public Optional<Question> getQuestionById(UUID id) {
        return questionRepository.findById(id);
    }

    public QuestionDTO createQuestion(Question question) {
        Question savedQuestion = questionRepository.save(question);
        return QuestionDTO.from(savedQuestion);
    }

    public QuestionDTO updateQuestion(UUID id, Question question) {
        questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
        question.setId(id);
        Question updatedQuestion = questionRepository.save(question);
        return QuestionDTO.from(updatedQuestion);
    }

    public void deleteQuestion(UUID id) {
        questionRepository.deleteById(id);
    }
}
