package com.example.quiz.dto;

import com.example.quiz.Quiz;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class QuizDetailDTO {

    private UUID id;
    private String name;
    private String description;
    private Set<QuestionDTO> questions = new HashSet<>();
    private Set<PlayertoquizDTO> scores = new HashSet<>();

    // Default constructor
    public QuizDetailDTO() {
    }

    // Parameterized constructor
    public QuizDetailDTO(UUID id, String name, String description, Set<QuestionDTO> questions, Set<PlayertoquizDTO> scores) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questions = questions;
        this.scores = scores;
    }

    // Constructor from Quiz entity
    public static QuizDetailDTO from(Quiz quiz) {
        Set<QuestionDTO> questions = quiz.getQuestions().stream().map(QuestionDTO::from).collect(Collectors.toSet());
        Set<PlayertoquizDTO> scores = quiz.getScores().stream().map(PlayertoquizDTO::new).collect(Collectors.toSet());
        return new QuizDetailDTO(quiz.getId(), quiz.getName(), quiz.getDescription(), questions, scores);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<QuestionDTO> questions) {
        this.questions = questions;
    }

    public Set<PlayertoquizDTO> getScores() {
        return scores;
    }

    public void setScores(Set<PlayertoquizDTO> scores) {
        this.scores = scores;
    }
}
