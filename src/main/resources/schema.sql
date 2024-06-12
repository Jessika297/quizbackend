/*
-- Erstelle die Quiz Tabelle
CREATE TABLE Quiz
(
    id          UUID PRIMARY KEY,
    name        VARCHAR NOT NULL,
    description VARCHAR
);

-- Erstelle die Question Tabelle
CREATE TABLE Question
(
    id     UUID PRIMARY KEY,
    quizid UUID REFERENCES Quiz (id) ON DELETE CASCADE,
    text   VARCHAR NOT NULL
);

-- Erstelle die Answer Tabelle
CREATE TABLE Answer
(
    id         UUID PRIMARY KEY,
    questionid UUID REFERENCES Question (id) ON DELETE CASCADE,
    text       VARCHAR NOT NULL,
    istrue     BOOLEAN NOT NULL
);

-- Erstelle die Player Tabelle
CREATE TABLE Player
(
    id       UUID PRIMARY KEY,
    name     VARCHAR NOT NULL,
    password VARCHAR NOT NULL
);

-- Erstelle die PlayertoQuiz Tabelle
CREATE TABLE PlayertoQuiz
(
    id       UUID PRIMARY KEY,
    playerid UUID REFERENCES Player (id) ON DELETE CASCADE,
    quizid   UUID REFERENCES Quiz (id) ON DELETE CASCADE,
    score    INT
);
*/