/*
-- Beispiel Daten in die Quiz Tabelle einfügen
INSERT INTO Quiz (id, name, description)
VALUES ('123e4567-e89b-12d3-a456-426614174000', 'Allgemeinwissen', 'Ein Quiz über Allgemeinwissen'),
       ('123e4567-e89b-12d3-a456-426614174001', 'Geografie', 'Ein Quiz über Weltgeografie');

-- Beispiel Daten in die Question Tabelle einfügen
INSERT INTO Question (id, quizid, text)
VALUES ('223e4567-e89b-12d3-a456-426614174000', '123e4567-e89b-12d3-a456-426614174001',
        'Was ist die Hauptstadt von Frankreich?'),
       ('223e4567-e89b-12d3-a456-426614174001', '123e4567-e89b-12d3-a456-426614174001',
        'Wie viele Kontinente gibt es auf der Erde?'),
       ('223e4567-e89b-12d3-a456-426614174002', '123e4567-e89b-12d3-a456-426614174001',
        'Welcher Fluss fließt durch Kairo?'),
       ('223e4567-e89b-12d3-a456-426614174020', '123e4567-e89b-12d3-a456-426614174000',
        'Welcher Planet ist der größte im Sonnensystem?'),
       ('223e4567-e89b-12d3-a456-426614174021', '123e4567-e89b-12d3-a456-426614174000',
        'Wer war der erste Mensch im Weltraum?');

-- Beispiel Daten in die Answer Tabelle einfügen
INSERT INTO Answer (id, questionid, text, istrue)
VALUES ('323e4567-e89b-12d3-a456-426614174000', '223e4567-e89b-12d3-a456-426614174000', 'Paris', TRUE),
       ('323e4567-e89b-12d3-a456-426614174001', '223e4567-e89b-12d3-a456-426614174000', 'Berlin', FALSE),
       ('323e4567-e89b-12d3-a456-426614174021', '223e4567-e89b-12d3-a456-426614174000', 'Hamburg', FALSE),
       ('323e4567-e89b-12d3-a456-426614174022', '223e4567-e89b-12d3-a456-426614174000', 'New York', FALSE),
       ('323e4567-e89b-12d3-a456-426614174002', '223e4567-e89b-12d3-a456-426614174001', '5', FALSE),
       ('323e4567-e89b-12d3-a456-426614174003', '223e4567-e89b-12d3-a456-426614174001', '7', TRUE),
       ('323e4567-e89b-12d3-a456-426614174029', '223e4567-e89b-12d3-a456-426614174001', '6', FALSE),
       ('323e4567-e89b-12d3-a456-426614174004', '223e4567-e89b-12d3-a456-426614174002', 'Nil', TRUE),
       ('323e4567-e89b-12d3-a456-426614174005', '223e4567-e89b-12d3-a456-426614174002', 'Amazonas', FALSE),
       ('323e4567-e89b-12d3-a456-426614174006', '223e4567-e89b-12d3-a456-426614174002', 'Elbe', FALSE),
       ('323e4567-e89b-12d3-a456-426614174024', '223e4567-e89b-12d3-a456-426614174020', 'Mars', FALSE),
       ('323e4567-e89b-12d3-a456-426614174025', '223e4567-e89b-12d3-a456-426614174020', 'Jupiter', TRUE),
       ('323e4567-e89b-12d3-a456-426614174031', '223e4567-e89b-12d3-a456-426614174020', 'Saturn', FALSE),
       ('323e4567-e89b-12d3-a456-426614174042', '223e4567-e89b-12d3-a456-426614174021', 'Neil Armstrong', FALSE),
       ('323e4567-e89b-12d3-a456-426614174043', '223e4567-e89b-12d3-a456-426614174021', 'Yuri Gagarin', TRUE),
       ('323e4567-e89b-12d3-a456-426614174045', '223e4567-e89b-12d3-a456-426614174021', 'Buzz Aldrin', FALSE);

-- Beispiel Daten in die Player Tabelle einfügen
INSERT INTO Player (id, name, password)
VALUES ('423e4567-e89b-12d3-a456-426614174000', 'Player 1', 'password'),
       ('423e4567-e89b-12d3-a456-426614174001', 'Player 2', 'password'),
       ('423e4567-e89b-12d3-a456-426614174002', 'GulaschGönner', 'Dönerstag');

-- Beispiel Daten in die PlayertoQuiz Tabelle einfügen
INSERT INTO PlayertoQuiz (id, playerid, quizid, score)
VALUES ('523e4567-e89b-12d3-a456-426614174000', '423e4567-e89b-12d3-a456-426614174000',
        '123e4567-e89b-12d3-a456-426614174000', 100),
       ('523e4567-e89b-12d3-a456-426614174001', '423e4567-e89b-12d3-a456-426614174001',
        '123e4567-e89b-12d3-a456-426614174000', 150),
       ('523e4567-e89b-12d3-a456-426614174002', '423e4567-e89b-12d3-a456-426614174000',
        '123e4567-e89b-12d3-a456-426614174001', 222),
       ('523e4567-e89b-12d3-a456-426614174003', '423e4567-e89b-12d3-a456-426614174001',
        '123e4567-e89b-12d3-a456-426614174001', 111);
*/