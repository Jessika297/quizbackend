package com.example.quiz.service;

import com.example.quiz.Answer;
import com.example.quiz.dao.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
@Service
public class AnswerService {

    @Autowired
    private AnswerDao answerDao;

    public List<Answer> getAllAnswers() {
        return answerDao.findAll();
    }

    public Optional<Answer> getAnswerById(UUID id) {
        return answerDao.findById(id);
    }

    public Answer addAnswer(Answer answer) {
        return answerDao.save(answer);
    }

    public void deleteAnswer(UUID id) {
        answerDao.deleteById(id);
    }
}
