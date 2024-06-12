package com.example.quiz.service;

import com.example.quiz.Question;
import com.example.quiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public Optional<Question> getQuestionById(Integer id) {
        return questionDao.findById(id);
    }

    public Question addQuestion(Question question) {
        return questionDao.save(question);
    }

    public Question updateQuestion(Integer id, Question updatedQuestion) {
        Optional<Question> optionalQuestion = questionDao.findById(id);
        if (optionalQuestion.isPresent()) {
            Question question = optionalQuestion.get();
            question.setCategory(updatedQuestion.getCategory());
            question.setDifficultylevel(updatedQuestion.getDifficultylevel());
            question.setOption1(updatedQuestion.getOption1());
            question.setOption2(updatedQuestion.getOption2());
            question.setOption3(updatedQuestion.getOption3());
            question.setOption4(updatedQuestion.getOption4());
            question.setQuestion(updatedQuestion.getQuestion());
            question.setAnswer(updatedQuestion.getAnswer());
            return questionDao.save(question);
        }
        return null;
    }

    public void deleteQuestion(Integer id) {
        questionDao.deleteById(id);
    }
}
