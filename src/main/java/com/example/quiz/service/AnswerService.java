package com.example.quiz.service;

import com.example.quiz.Answer;
import com.example.quiz.dto.AnswerDTO;
import com.example.quiz.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;


@Transactional
@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public AnswerDTO createAnswer(Answer answer) {
        Answer savedAnswer = answerRepository.save(answer);
        return new AnswerDTO(savedAnswer.getId(), savedAnswer.getQuestion().getId(), savedAnswer.getText(), savedAnswer.isIstrue());
    }

    public AnswerDTO updateAnswer(UUID id, Answer answer) {
        answerRepository.findById(id).orElseThrow(() -> new RuntimeException("Answer not found"));
        answer.setId(id);
        Answer updatedAnswer = answerRepository.save(answer);
        return new AnswerDTO(updatedAnswer.getId(), updatedAnswer.getQuestion().getId(), updatedAnswer.getText(), updatedAnswer.isIstrue());
    }

    public void deleteAnswer(UUID id) {
        answerRepository.deleteById(id);
    }
}
