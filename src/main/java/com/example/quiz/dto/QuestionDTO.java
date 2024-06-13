package com.example.quiz.dto;

import com.example.quiz.Question;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class QuestionDTO {

    private UUID id;
    private UUID quizid;
    private String text;
    private Set<AnswerDTO> answers;

    // Default constructor
    public QuestionDTO() {
    }

    // Parameterized constructor
    public QuestionDTO(UUID id, UUID quizid, String text, Set<AnswerDTO> answers) {
        this.id = id;
        this.quizid = quizid;
        this.text = text;
        this.answers = answers;
    }

    // Constructor from Question entity
    public static QuestionDTO from(Question question) {
        Set<AnswerDTO> answers = question.getAnswers().stream()
                .map(AnswerDTO::from)
                .collect(Collectors.toSet());
        return new QuestionDTO(question.getId(), question.getQuiz().getId(), question.getText(), answers);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getQuizid() {
        return quizid;
    }

    public void setQuizid(UUID quizid) {
        this.quizid = quizid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<AnswerDTO> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<AnswerDTO> answers) {
        this.answers = answers;
    }
}
