package com.example.quiz.controller;

import com.example.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    //todo das hier alles mit dem quiz zurück geben
    @Autowired
    private QuestionService questionService;

//    @GetMapping
//    public List<Question> getAllQuestions() {
//        return questionService.getAllQuestions();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Question> getQuestionById(@PathVariable Integer id) {
//        return questionService.getQuestionById(id);
//    }
//
//    @PostMapping
//    public Question addQuestion(@RequestBody Question question) {
//        return questionService.addQuestion(question);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteQuestion(@PathVariable Integer id) {
//        questionService.deleteQuestion(id);
//    }
}
