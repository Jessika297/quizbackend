package com.example.quiz.dto;

import com.example.quiz.Quiz;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class QuizDetailDTO {

    private final Set<QuestionDTO> questions = new HashSet<>();
    private final Set<PlayertoquizDTO> scores = new HashSet<>();
    private UUID id;
    private String name;
    private String description;

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

    public QuizDetailDTO from(Quiz quiz) {
        var dto = new QuizDetailDTO();
        dto.id = quiz.getId();
        dto.name = quiz.getName();
        dto.description = quiz.getDescription();
        //dto.questions = quiz.getQuestions().stream().map(QuestionDTO::from).collect(Collectors.toSet());
        //dto.scores = quiz.getScores().stream().map(PlayertoquizDTO::from).collect(Collectors.toSet());
        return dto;
    }

}
