package com.example.quiz.service;

import com.example.quiz.Quiz;
import com.example.quiz.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
@Service
public class QuizService {

    @Autowired
    private QuizDao quizDao;

    public List<Quiz> getAllQuizzes() {
        List<Quiz> all = quizDao.findAll();
        return all;
    }

    public Optional<Quiz> getQuizById(UUID id) {
        return quizDao.findById(id);
    }

    public Quiz addQuiz(Quiz quiz) {
        return quizDao.save(quiz);
    }

    public void deleteQuiz(UUID id) {
        quizDao.deleteById(id);
    }
}
